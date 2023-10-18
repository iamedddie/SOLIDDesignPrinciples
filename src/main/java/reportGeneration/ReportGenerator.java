package reportGeneration;

public class ReportGenerator {
    public void generate(Report report) {
        String output = report.getReportText();
        System.out.println("Report created on: " + report.getDateCreated());
        System.out.println(output);
    }
}
