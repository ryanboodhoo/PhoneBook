import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        // Q1
        phoneBook.add("Ryan", "123-456-7890");
        phoneBook.add("Shawn", "234-567-8901");

        // Q2
        phoneBook.addAll("Ryan", "345-678-9012", "456-789-0123");

        // Q3
        phoneBook.remove("Shawn");

        // Q4
        System.out.println("Has entry for Ryan: " + phoneBook.hasEntry("Ryan"));  // should print true
        System.out.println("Has entry for Shawn: " + phoneBook.hasEntry("Shawn"));      // should print false

        // Q5
        List<String> ryanNumbers = phoneBook.lookup("Ryan");
        System.out.println("Phone numbers for Ryan: " + ryanNumbers);

        // Q6
        String owner = phoneBook.reverseLookup("345-678-9012");
        System.out.println("Owner of phone number 345-678-9012: " + owner);

        // Q7
        List<String> allNames = phoneBook.getAllContactNames();
        System.out.println("All contact names: " + allNames);

        // Q8
        Map<String, List<String>> phoneBookMap = phoneBook.getMap();
        System.out.println("PhoneBook Map: " + phoneBookMap);


    }
}
