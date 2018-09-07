public class CalculatorImpl implements Calculator {

    public CalculatorImpl() {
        display = ""; // inicjalizacja zmiennej display
    }

    @Override
    public void pressNumber(int number) {

    }

    String display;// deklaracja zmiennej display

    @Override
    public String display() {
        return display;
    }

    @Override
    public void add(double number1, double number2) {
        double result = number1+number2;
        display = String.valueOf(result);
    }

    @Override
    public void sub(double number1, double number2) {

    }

    @Override
    public void div(double number1, double number2) {

    }

    @Override
    public void multi(double number1, double number2) {

    }


}
