import java.io.Serializable;

public class MailMessage implements Sendable<String> {
    private String from;
    private String to;
    private String Content;

    public MailMessage(String from, String to, String massage) {
        this.from = from;
        this.to = to;
        this.Content = massage;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getContent() {
        return Content;
    }
}
