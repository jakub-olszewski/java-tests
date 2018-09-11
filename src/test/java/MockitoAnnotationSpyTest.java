import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

//@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationSpyTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenNotUseSpyAnnotation_thenCorrect() {
        // czesciowa atrapa prawdziwego obiektu, w mock() bylo ArrayList.class
        // w tym przypadku mamy new ArrayList<String> czyli prawdziwy obiekt
        List<String> spyList = Mockito.spy(new ArrayList<String>());

        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());

        doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }

    /**
     * Jak widac ponizej mamy prawdziwy obiekt new ArrayList
     */
    @Spy
    List<String> spiedList = new ArrayList<String>();

    @Test
    public void whenUseSpyAnnotation_thenSpyIsInjected() {
        spiedList.add("one");
        spiedList.add("two");

        Mockito.verify(spiedList).add("one");
        Mockito.verify(spiedList).add("two");

        assertEquals(2, spiedList.size());

        Mockito.doReturn(100).when(spiedList).size();
        assertEquals(100, spiedList.size());
    }

}