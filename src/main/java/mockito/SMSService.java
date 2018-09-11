package mockito;

public interface SMSService {
    public SMSMessage sendSMS(String phoneNumber, String content);
}