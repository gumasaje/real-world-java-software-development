package chapter_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class BankStatementCSVParserTest {

    private final BankStatementParser statementParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOneCorrectLine() throws Exception {
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction result = statementParser.parseFrom(line);

        final BankTransaction expected
                = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");
        Assertions.assertEquals(expected, result);
    }
}
