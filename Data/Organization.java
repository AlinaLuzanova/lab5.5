package Data;

import java.time.LocalDate;

public class Organization implements Comparable{

    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float annualTurnover; //Значение поля должно быть больше 0
    private String fullName; //Значение этого поля должно быть уникальным, Длина строки не должна быть больше 1688, Поле не может быть null
    private long employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле не может быть null
    private Address postalAddress; //Поле может быть null

    public Organization(
            long id,
            String name,
            java.time.LocalDate creationDate,
            Coordinates coordinates,
            float annualTurnover,
            String fullName,
            long employeesCount,
            OrganizationType type,
            Address postalAddress
    )
    {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.coordinates = coordinates;
        this.annualTurnover = annualTurnover;
        this.fullName = fullName;
        this.employeesCount = employeesCount;
        this.postalAddress = postalAddress;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public float getAnnualTurnover(){
        return annualTurnover;
    }

    public String getFullName(){
        return fullName;
    }

    public  long getEmployeesCount(){
        return employeesCount;
    }

    public OrganizationType getType() {
        return type;
    }

    public Address getPostalAddress() {
        return postalAddress;
    }


    @Override
    public String toString() {
        String information = "Получить ифнормацию об Организации\n";
        information += ("Name: " + name + '\n');
        information += ("ID: " + id + '\n');
        information += (coordinates.toString());
        information += ("creationDate: " + creationDate + '\n');
        information += ("annual Turnover: " + annualTurnover + '\n');
        information += ("full Name: " + fullName + '\n');
        information += ("employees Count: " + employeesCount + '\n');
        information += ("postal Address: " + postalAddress + '\n');
        return information;


}
