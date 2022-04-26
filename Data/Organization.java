package Data;

import java.time.LocalDate;

public class Organization implements Comparable {

    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float annualTurnover; //Значение поля должно быть больше 0
    private String fullName; //Значение этого поля должно быть уникальным, Длина строки не должна быть больше 1688, Поле не может быть null
    private long employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле не может быть null
    private Address postalAddress; //Поле может быть null

    public Organization(long id, String name, Coordinates coordinates, float annualTurnover,
                        String fullName, OrganizationType type, Address postalAddress) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.annualTurnover = annualTurnover;
        this.fullName = fullName;
        this.employeesCount = employeesCount;
        this.postalAddress = postalAddress;
        this.type = type;

        creationDate = LocalDate.now();
    }

    public Float getCoordinateX() {
        return coordinates.getX();
    }

    public float getCoordinateY() {
        return coordinates.getY();
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Address getPostalAddress() {
        return postalAddress;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAnnualTurnover() {
        return annualTurnover;
    }

    public String getFullName() {
        return fullName;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getOrganizationType() {
        return type.toString();
    }
    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public String toString() {
        return "id = " + id + "\n"
                + "name = " + name + "\n"
                + "coordinates: " + coordinates + "\n"
                + "annualTurnover = " + annualTurnover + "\n"
                + "fullName = " + fullName + "\n"
                + "type = " + type + "\n"
                + "postalAddress = " + postalAddress + "\n"
                + "creationDate = " + creationDate;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}