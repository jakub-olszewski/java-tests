/**
 * Klasa kawiarni z serwowanie kawy
 */
public class Cafe {

    boolean isServe;

    /**
     * Konstruktor kawy
     */
    public Cafe() {
        this.isServe = false;
    }

    /**
     * Serwowanie kawy
     */
    public void serveCoffee() {
        isServe = true;
    }

    /**
     * Sprawdzenie czy kawa została zaserwowana
     * @return prawda/falsz
     */
    public boolean canServeCoffee() {
        return isServe;
    }
}
