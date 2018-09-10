import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class CalculatorExceptionTest {

    // Zadanie doprowadzic testy do greena

    Calculator calc;

    @Before
    public void setUp() {
        calc = new CalculatorImpl();
    }

    //testowanie przez adnotacje
    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        calc.div(1, 0);
        //calc.pressNumber(null);
        //throw new IllegalStateException("message");
    }

    @Test
    public void exceptionDivideByZeroExistTest(){
        boolean isException = false;
        try {
            calc.div(1, 0);
        } catch (Exception e) {
            isException = true;
        }
        assertTrue("Exception not thow !",isException);
    }

    //testowanie ręczne
    @Test
    public void divideByZero2Test() {
        try {
            calc.div(1, 0);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(e.getMessage().contains("Error divide by zero"));
        }
    }

    //testowanie by rule
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void divideByZero3Test() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Error divide by zero");
        calc.div(1, 0);
    }
}