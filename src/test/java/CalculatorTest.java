import org.junit.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    public void shouldDisplayNumber(){

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
    public void shouldAddSuccessedExecute(){

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