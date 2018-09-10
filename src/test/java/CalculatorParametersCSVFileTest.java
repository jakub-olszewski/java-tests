import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametersCSVFileTest {

    // zmienna/ pole dostepna w kazdej metodzie
    Calculator calc;

    //przed wykonaniem kazdego testu utworz instancje kalkulatora @Before
    //wykonaj testy odejmowania mnozenia i dzielenia na podstawie przykladu ponizej
    //utworz odpowiednie pliki CSV i zmodyfikuj sciezki w @FileParameters

    // metoda ponizej uruchamia sie przed kazdym testem czyli przed wykonaniem metody @Test
    @Before
    public void setUp(){

        calc = new CalculatorImpl();

        // zmienna ponizej dostepna tylko w bloku kodu {}
        // Calculator calc = new CalculatorImpl();
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParametersAddCSVFileTest.csv")
    public void addTest(double number1, double number2, String result) {
        calc.add(number1,number2);
        assertEquals(result, calc.display());
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParametersSubCSVFileTest.csv")
    public void subTest(double number1, double number2, String result) {
        calc.add(number1,number2);
        assertEquals(result, calc.display());
    }
}
