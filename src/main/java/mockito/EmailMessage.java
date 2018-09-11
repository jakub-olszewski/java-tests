package mockito;

public class EmailMessage {
    private  String title;
    private  String email;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private  String message;

    public EmailMessage(String title, String email, String message) {
        this.title = title;
        this.email = email;
        this.message = message;
    }
}
