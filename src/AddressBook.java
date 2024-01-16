import java.util.ArrayList;

public class AddressBook {
    private int code;
    private ArrayList<Person> person;

    public AddressBook(int code, ArrayList<Person> person) {
        this.code = code;
        this.person = person;
    }

    public AddressBook(int code) {
        this.code = code;
    }

    public AddressBook() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "code=" + code +
                ", person=" + person +
                '}';
    }
}
