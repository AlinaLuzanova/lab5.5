package Data;

public class Address {
    private String name; // поле не может быть null

    public Address (String postalAddress) {
        this.name = postalAddress;
    }


    @Override
    public String toString() {
        return name;
    }
}