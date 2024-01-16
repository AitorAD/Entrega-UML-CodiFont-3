public class Address {
    private String street;
    private String city;
    private int postalCode;
    private Person person;
    private State state;

    public Address(String street, String city, int postalCode, Person person, State state) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.person = person;
        this.state = state;
    }

    public Address(String street, String city, int postalCode, State state) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                ", person=" + person +
                ", state=" + state +
                '}';
    }
}
