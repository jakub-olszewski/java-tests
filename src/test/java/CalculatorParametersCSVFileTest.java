import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametersCSVFileTest {

    //przed wykonaniem kazdego testu utworz instancje kalkulatora @Before
    //wykonaj testy odejmowania mnozenia i dzielenia na podstawie przykladu ponizej
    //utworz odpowiednie pliki CSV i zmodyfikuj sciezki w @FileParameters

    @Test
    @FileParameters("src/test/resources/CalculatorParametersCSVFileTest.csv")
    public void addTest(double number1, double number2, String result) {
        calc.add(number1,number2);
        assertEquals(result, calc.display());
    }

}
