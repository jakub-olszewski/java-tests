package mockito;

import java.util.Optional;

public class NotificationServiceImpl implements NotificationService {

    public NotificationServiceImpl(EmailService emailService, SMSService smsService) {
        this.emailService = emailService; this.smsService = smsService;
    }

    private SMSService smsService;
    private EmailService emailService;

    public void sendNotification(Optional<String> email, Optional<String> phoneNumber, String notificationContent) {
        if (email.isPresent()) {
            emailService.sendEmail(email.get(), notificationContent);
        }
        if (phoneNumber.isPresent()) {
            smsService.sendSMS(email.get(), notificationContent);
        }
    }
}