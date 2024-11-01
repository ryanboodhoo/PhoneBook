import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phonebook;//map

    public Map<String, List<String>> getPhonebook() {
        return phonebook;
    }

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this(new HashMap<>());
    } // calling another constructor
//Q1

    public void add(String name, String phoneNumber) {
        List<String> numbs = new ArrayList<>();
        numbs.add(phoneNumber);
        phonebook.put(name, numbs);
    }

    //Q2            // ... means multiple
    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));
    }
    //Q3
    public void remove(String name) {
        phonebook.remove(name);
    }
    //Q4
    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }
    //Q5
    public List<String> lookUp(String name) {
            return phonebook.get(name);
        }
    //Q6
    public String reverseLookup(String phoneNumber) {
        String name = "";
//looping though the Map ,map named phoneBook, any keys and values inside the Phonebook
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) { // Check if the value contains the phone number
                name = entry.getKey(); // If it does, set name to the corresponding key
            }
        }
        return name;
        // return the key value of name
    }

    //Q7
    public List<String> getAllContactNames() {
        List<String> names = new ArrayList<>();

        for (Map.Entry<String, List<String>> i : phonebook.entrySet()) {
            names.add(i.getKey());
        }
        return names;
    }
    //Q8
    public Map<String, List<String>> getMap() {
        Map<String, List<String>> phoneNumber = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            phoneNumber.put(entry.getKey(), new ArrayList<>(entry.getValue())); // deep copy
        }

        return phoneNumber;

    }
}

