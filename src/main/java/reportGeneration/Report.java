package reportGeneration;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Report {

    private String content;
    private LocalDateTime dateCreated;

    public Report(String content) {
        this.content = content;
        dateCreated = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    }

    public String getReportText() {
        return "Report Content: " + this.content; // just a simple concatenation
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    // Other methods...
}

