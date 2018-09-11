package mockito.services;

import mockito.EmailMessage;
import mockito.EmailService;
import mockito.NotificationServiceImpl;
import mockito.SMSService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import pl.sdacademy.tests.mockito.*;

import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Mock
    EmailService emailService;

    @Mock
    SMSService smsService;

    @InjectMocks
    NotificationServiceImpl notificationService;

    public NotificationServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Before
    public void setUp() {
        emailService = Mockito.mock(EmailService.class);
        smsService = Mockito.mock(SMSService.class);
        notificationService = new NotificationServiceImpl(emailService, smsService);
    }

    @Test
    public void mailTest(){
        EmailMessage message = new EmailMessage("Message from boss","boss@example.com","How your day ?");
        //tutaj inicjujemy obiekt, który chcemy zwracać, ustawiamy wartości pól itp

        //zwrocenie wiadomosci po sendMail
        when(emailService.sendEmail(anyObject(), anyObject())).thenReturn(message);

        //nie zwrocenie wiadomosci po sendMail gdy metoda sendMail jest void
        //doNothing().when(emailService).sendEmail(anyObject(), anyObject());

        //jesli wyslesz mail do admin@admin.pl to dostaniesz w odpowiedzi maila messageFromAdmin
        EmailMessage messageFromAdmin = new EmailMessage("Message from admin","admin@example.com","Change system password!"); //tutaj inicjujemy obiekt, który chcemy zwracać, ustawiamy wartości pól itp
        when(emailService.sendEmail(eq("admin@admin.pl"), anyObject())).thenReturn(messageFromAdmin);

        EmailMessage massage = emailService.sendEmail("admin@admin.pl","Message ... ");

        // verify mozna wykonac tylko na mockowanych obiektach!
        verify(emailService, times(1)).sendEmail("admin@admin.pl","Message ... ");
        verify(emailService, never()).sendEmail("user@admin.pl","Message ... ");
        verify(emailService, atLeastOnce()).sendEmail("admin@admin.pl","Message ... ");
        verify(emailService, atLeast(1)).sendEmail("admin@admin.pl","Message ... ");
        verify(emailService, atMost(1)).sendEmail("admin@admin.pl","Message ... ");

    }
}