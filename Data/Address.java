package Data;

public class Address {
    private String name; // поле не может быть null

    public Address (String postalAdress) {
        this.name = postalAdress;
    }

    @Override
    public String toString() {
        return name;
    }
}