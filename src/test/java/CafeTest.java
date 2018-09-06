import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CafeTest {

    @Test
    public void shouldServeCoffee() {

        // given
        Cafe cafe = new Cafe();

        // when
        cafe.serveCoffee();

        // then
        assertTrue(cafe.canServeCoffee());

    }

    @Test
    public void shouldNotServeCoffee() {

        // given
        Cafe cafe = new Cafe();

        // when
        //cafe.serveCoffee();

        // then
        assertFalse(cafe.canServeCoffee());

    }

}