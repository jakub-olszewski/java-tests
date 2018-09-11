import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MockitoAnnotationMockTest {

    @Before
    public void init() {
        // inicjalizacja mechanizmu mockowania
        MockitoAnnotations.initMocks(this);
    }


    /**
     * Mockowanie wewnatrz metody, widoczne tylko w danej metodzie
     */
    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);

        mockList.add("one");
        Mockito.verify(mockList).add("one");
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }

    /**
     * Obiekt jest nie zainicjalizowany mockujemy metody
     * ktore zachowauja sie tak jak wskazemy podczas mockowania
     * 'when' kiedy co ma sie dziac i co ma zwracac
     */
    @Mock
    List<String> mockedList;

    /**
     * Mokowanie z obiektem globalnym dostepnym w wielu metodach
     */
    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {
        mockedList.add("one");
        verify(mockedList).add("one");
        assertEquals(0, mockedList.size());

        when(mockedList.size()).thenReturn(100);
        assertEquals(100, mockedList.size());
    }


    @Test
    public void testMockListAddMultiple() {
        String addString = "some string multiple";
        mockedList.add(addString);
        mockedList.add(addString);
        mockedList.add("sda");

        verify(mockedList, times(3)).add(anyString());
    }

    @Test
    public void calculatorMockitoTest() throws CalculatorException {
        // definiowanie jak ma dzialac atrapa
        Calculator calc = Mockito.mock(Calculator.class);
       Mockito.when(calc.display()).thenReturn("1234");

       // wykonanie metody zdefiniowanej wyzej
       System.out.println("calc display :"+calc.display());

       // weryfikowanie dzialania
       verify(calc, times(1)).display();
       verify(calc,never()).pressNumber(null);
    }


}
