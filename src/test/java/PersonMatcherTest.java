import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonMatcherTest {

    @Spy
    List<Person> personsList = new ArrayList<Person>();

    List<Person> harryFriends = new ArrayList<Person>();
    private Person harry;
    private Person hermiona;
    private Person ron;
    private Person zgredek;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        harry = new Person("Harry", 14);
        personsList.add(harry);
        hermiona = new Person("Hermiona", 14);
        personsList.add(hermiona);
        personsList.add(new Person("Severus", 34));
        personsList.add(new Person("Malfoy", 13));
        zgredek = new Person("Zgredek", 232);
        personsList.add(zgredek);
        ron = new Person("Ron", 15);
        personsList.add(ron);

        harryFriends.add(hermiona);
        harryFriends.add(ron);


    }

    //sprawdz czy lista osob i przyjaciol nie jest pusta ( uzyj : isNotNull isEmpty)
    @Test
    public void listNotEmptyTest() {
    }

    //sprawdz czy przyjaciele harrego maja mniej niz 16 lat ( uzyj : isLessThan )
    @Test
    public void harryFriendsLess16yearsOldTest(){

    }

    //sprawdz czy zgredek ma wiecej niz 100 lat ( uzyj : isGreaterThan )
    @Test
    public void zgredekHaveMoreThan100yearsTest(){
    }

    //sprawdz czy zgredek istnieje tylko raz na liscie ( uzyj : containsOnlyOnce )
    @Test
    public void zgredekExistOnlyOnceTest(){

    }

    //sprawdz czy harry jest pierwszy na liscie ( uzyj : atIndex )
    @Test
    public void harryIsFirstOnList(){
    }

    //sprawdz czy ron jest ostatni na liscie ( uzyj : atIndex )
    @Test
    public void ronIsLastPersonOnListTest(){
    }

    //sprawdz czy ron jest harryego przyjacielem ( uzyj : contains isIn )
    @Test
    public void ronIsHarryFriendAndPersonList(){
    }

    //sprawdz czy ron i hermiona wystepuja tylko raz na liscie przyjaciol harrego ( uzyj : containsOnlyOnce )
    @Test
    public void ronAndHermoinaAreHarryFriendsOnlyOnceTest(){
    }

    //dodatkowe
    @Test
    public void listIsSortedByAge(){
    }

    //dodatkowe ( uzyj : isBeforeYear isAfterYear isBetween )
    @Test
    public void checkHarryBirthDayTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        harry.setBirthdayDate(sdf.parse("2002-06-01"));
    }

    //sprawdz czy harry ma faktycznie na imie harry (uzyj isEqual, starts, ends)
    @Test
    public void harryNameTest(){

    }

    //sprawdz czy lista przyjaciol harrego faktycznie zawiera jego przyjaciol i ile ich faktycznie jest (uzyj hasSize, contains, doesNotContain)
    @Test
    public void harryFriendsTest(){
    }

    //dodatkowo
    // wlasny PersonAssert
    @Test
    public void hermionaNoBirthdayTest(){
    }

    //dodatkowo
    @Test
    public void harryNoBirthdayTest() throws ParseException {
    }
}


