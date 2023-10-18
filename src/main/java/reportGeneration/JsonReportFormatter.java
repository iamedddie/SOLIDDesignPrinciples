package reportGeneration;

public class JsonReportFormatter implements ReportFormatter {
    @Override
    public String formatReport(Report report) {
        // In a real application, you might use a library like Jackson or Gson here.
        // This is a simplified representation.
        return "{ \"reportContent\": \"" + report.getReportText() + "\" }";
    }
}
