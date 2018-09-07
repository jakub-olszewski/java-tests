/**
 * Stwórz interfejs o nazwie Calculator oraz jego pusta implementacje CalculatorImpl z metodami
 * pressNumber(), display(), add(), sub(), div(), multi() [+, -, / , * ]
 */
public interface Calculator {

    /**
     * Metoda dzialajaca na wcisniecie klawisza na kalkulatorze
     * @param number wcisnietym klawiszem
     */
    public void pressNumber(int number);

    /**
     * Metoda zwraca zawartosc wyswietlacza
     * @return zawartosc wyswietlacza
     */
    public String display ();

    public void add();

    public void sub();

    public void div();

    public void multi();
}
