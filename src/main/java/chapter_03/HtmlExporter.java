package chapter_03;

public class HtmlExporter implements Exporter {
    @Override
    public String export(SummaryStatistics summaryStatistics) {

        String result = "<!DOCTYPE html>\n";
        result += "<html lang=\"en\">\n";
        result += "<head><title>Bank Transaction Report</title></head>\n";
        result += "<body>\n";
        result += "<ul>\n";
        result += "<li><strong>The sum is</strong>: " + summaryStatistics.getSum() + "</li>\n";
        result += "<li><strong>The average is</strong>: " + summaryStatistics.getAverage() + "</li>\n";
        result += "<li><strong>The max is</strong>: " + summaryStatistics.getMax() + "</li>\n";
        result += "<li><strong>The min is</strong>: " + summaryStatistics.getMin() + "</li>\n";
        result += "</ul>\n";
        result += "</body>\n";
        result += "</html>\n";
        return result;
    }
}
