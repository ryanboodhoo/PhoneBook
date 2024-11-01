import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }


    @Test
    void createPhoneBookWithoutParameters() {

        assertTrue(phoneBook.getPhonebook() instanceof HashMap);
    }


    @Test
    public void addAll() {
        // Arrange
        String name = "Ryan";
        String[] phoneNumbers = { // expected
                "345-678-9012", "456-789-0123"
        };

        // Act
        phoneBook.addAll(name, phoneNumbers);// added name and all phoneNumbers associated with that name
        List<String> actual = phoneBook.lookUp(name); // used the lookup method to return all the phone numbers with that name


        // Ensure the size of actual list matches the expected size of list
        Assertions.assertEquals(phoneNumbers.length, actual.size());

    }


    @Test
    void remove() {

        // Given

        String phoneNumbers = "302-292-2099";
        String name = "Ryan";


        // when

        phoneBook.add(name, phoneNumbers);

        phoneBook.remove(name);

        // then

        Assertions.assertEquals(0, phoneBook.getPhonebook().size());

    }


    @Test
    void reverseLookUp() {
        // Arrange - Given
        String phoneNumbers = "302-292-2099";
        String name = "Ryan";


        // when
        phoneBook.add(name, phoneNumbers);

        String phoneNumberName = phoneBook.reverseLookup(phoneNumbers);

        Assertions.assertEquals("Ryan", phoneNumberName);


    }
}




