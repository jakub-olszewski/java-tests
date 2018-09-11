public class CalculatorException extends Exception {

    boolean offCalculator;

    public CalculatorException() {
        super("Calculator Error");
    }

    public CalculatorException(String message) {
        super(message);
    }


    public CalculatorException(String message, boolean off) {
        super(message);
        this.offCalculator = off;
    }
}
