

public class Assertions {


    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }
}