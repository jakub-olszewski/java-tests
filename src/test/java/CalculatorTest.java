import org.junit.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// default runner
//@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        // given
         calc = new CalculatorImpl();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldDisplayNumber() throws CalculatorException {

        // when
        int number = 5;
        calc.pressNumber(number);

        // then
        assertTrue(String.valueOf(number).equals(calc.display()), "Na wyświetlaczu nie ma liczby " + number);
    }

    @Test
    public void shouldNotDisplayNumber(){

        // when
        // nic nie wciskamy na kalkulatorze

        // then
        assertTrue(calc.display().isEmpty(), "Wyświetlacz nie jest pusty ");
    }

    /**
     * Test 5 przykladow wykonania metody add() zakonczonych sukcesem
     */
    @Test
    public void shouldAddSuccessedExecuteTest(){

        calc.add(1,2);
        assertTrue("3.0".equals(calc.display()));
        calc.add(2,2);
        assertTrue("4.0".equals(calc.display()));
        calc.add(3,2);
        assertTrue("5.0".equals(calc.display()));
        calc.add(4,2);
        assertTrue("6.0".equals(calc.display()));
        calc.add(5,2);
        assertTrue("7.0".equals(calc.display()));

    }


    @Ignore
    @Test
    public void pressNumber() {
    }

    @Ignore
    @Test
    public void display() {
    }

    @Ignore
    @Test
    public void add() {
    }

    @Ignore
    @Test
    public void sub() {
    }

    @Ignore
    @Test
    public void div() {
    }

    @Ignore
    @Test
    public void multi() {
    }
}