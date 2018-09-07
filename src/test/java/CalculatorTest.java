import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        // given
         calc = new CalculatorImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void shouldDisplayNumber(){

        // when
        int number = 5;
        calc.pressNumber(number);

        // then
        assertTrue(String.valueOf(number).equals(calc.display()), "Na wyświetlaczu nie ma liczby " + number);
    }

    @Test
    void shouldNotDisplayNumber(){

        // when
        // nic nie wciskamy na kalkulatorze

        // then
        assertTrue(calc.display().isEmpty(), "Wyświetlacz nie jest pusty ");
    }


    @Test
    void pressNumber() {
    }

    @Test
    void display() {
    }

    @Test
    void add() {
    }

    @Test
    void sub() {
    }

    @Test
    void div() {
    }

    @Test
    void multi() {
    }
}