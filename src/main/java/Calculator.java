/**
 * Stwórz interfejs o nazwie Calculator oraz jego pusta implementacje CalculatorImpl z metodami
 * pressNumber(), display(), add(), sub(), div(), multi() [+, -, / , * ]
 */
public interface Calculator {

    /**
     * Metoda dzialajaca na wcisniecie klawisza na kalkulatorze
     * @param number wcisnietym klawiszem
     */
    public void pressNumber(Object number) throws CalculatorException;

    /**
     * Metoda zwraca zawartosc wyswietlacza
     * @return zawartosc wyswietlacza
     */
    public String display ();

    public void add(double number1, double number2);

    public void sub(double number1, double number2);

    public void div(double number1, double number2);

    public void multi(double number1, double number2);
}
