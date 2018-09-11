import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationCaptorTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenNotUseCaptorAnnotation_thenCorrect() {
        List mockList = Mockito.mock(List.class);

        // powolanie do zycia przechwytywacza String object
        ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);

        mockList.add("one");

        // przechwycenie dodanego powyzej obiektu "one"
        Mockito.verify(mockList).add(arg.capture());

        // pobieramy i sprawdzamy przechwycona wartosc
        assertEquals("one", arg.getValue());
    }

    @Test
    public void calc_whenNotUseCaptorAnnotation_thenCorrect() throws CalculatorException {
        Calculator calc = Mockito.mock(Calculator.class);

        // powolanie do zycia przechwytywacza String object
        ArgumentCaptor<Double> arg = ArgumentCaptor.forClass(Double.class);

        calc.pressNumber(2);

        // przechwycenie dodanego powyzej obiektu "one"
        //Mockito.verify(calc).add(arg.capture());

        // pobieramy i sprawdzamy przechwycona wartosc
        //assertEquals(2, arg.getValue());
    }

    @Mock
    List mockedListObject;

    @Captor
    ArgumentCaptor argCaptor;

    @Test
    public void whenUseCaptorAnnotation_thenTheSam() {
        mockedListObject.add("one");

        // powolanie do zycia przechwytywacza String object
        Mockito.verify(mockedListObject).add(argCaptor.capture());

        assertEquals("one", argCaptor.getValue());
    }

}