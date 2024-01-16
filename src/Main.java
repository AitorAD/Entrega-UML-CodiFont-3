public class Main {
    public static void main(String[] args) {
        Country country = new Country(1,"country");
        State state = new State(1, "state", country);
        Address address = new Address("Street", "City", 03450, state);
        AddressBook addressBook = new AddressBook(1);
        Person person = new Person("name", 100000000, "email", addressBook, address);

        System.out.println(person);
    }
}
