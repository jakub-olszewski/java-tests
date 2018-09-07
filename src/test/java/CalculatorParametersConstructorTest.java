import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

// default runner
//@RunWith(JUnit4.class)
@RunWith(value = Parameterized.class)// oznacza ze uzyjemy parametrów - wersja podstawowa
public class CalculatorParametersConstructorTest {

    double number1, number2;//liczby globalne do testów
    String result;// wynik
    Calculator calc;// kalkulator

    // parametry są wrzucane do konstruktora
    public CalculatorParametersConstructorTest(double number1, double number2, String result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    @Parameterized.Parameters(name = "Test {index} :  addTest ( {0} + {1} ) = {2} ")
    public static Collection<Object[]> data() {
        // kolejnosc w liscie tak jak w konstruktorze
        return Arrays.asList(new Object[][]{{1, 2, "3.0"}, {2, 1, "3.0"}, {3, 2, "5.0"}, {2, 5, "7.0"}, {3, 6, "9.0"}});
    }

    @Test
    public void shouldAddSuccessedExecuteTest(){

        // given
        calc = new CalculatorImpl();

        // when
        calc.add(1,2);

        // then
        assertTrue("3.0".equals(calc.display()));

    }
}
