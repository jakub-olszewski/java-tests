import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

// default runner
//@RunWith(JUnit4.class)
@RunWith(value = Parameterized.class)// oznacza ze uzyjemy parametrów - wersja podstawowa
public class CalculatorParametersFieldsTest {

    Calculator calc;// kalkulator

    // ponizej pola z adnotacja parametrów
    @Parameterized.Parameter(value = 0)
    public double number1;

    @Parameterized.Parameter(value = 1)
    public double number2;

    @Parameterized.Parameter(value = 2)
    public String result;

    //kolejnosc w 'name' tak jak w konstruktorze czyli
    // {0} to number1
    // {1} to number2
    // {2} to result
    @Parameterized.Parameters(name = "Test {index} :  addTest ( {0} + {1} ) = {2} ")
    public static Collection<Object[]> data() {
        // kolejnosc w liscie tak jak w konstruktorze
        return Arrays.asList(new Object[][]{{1, 2, "3.0"}, {2, 1, "3.0"}, {3, 2, "5.0"}, {2, 5, "7.0"}, {3, 6, "9.0"}});
    }

    @Test
    public void shouldAddSuccessedExecuteTest(){
        System.out.println("Uruchamiam metode shouldAddSuccessedExecuteTest()");
        System.out.println(String.format("a=%s b=%s result=%s",number1,number2,result));

        // given
        calc = new CalculatorImpl();

        // when
        calc.add(number1,number2);

        // then
        assertTrue(result.equals(calc.display()));
        System.out.println("Zakonczenie metody shouldAddSuccessedExecuteTest()");
        System.out.println("--------------------------------------------------");

    }
}
