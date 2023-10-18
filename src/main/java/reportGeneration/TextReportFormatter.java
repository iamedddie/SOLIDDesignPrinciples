package reportGeneration;

public class TextReportFormatter implements ReportFormatter {
    @Override
    public String formatReport(Report report) {
        return "Report Content: " + report.getReportText();
    }
}
