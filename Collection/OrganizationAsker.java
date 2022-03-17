package Collection;
import Data.*;
import Collection.EmptyIO;
import WrongFormat.WrongFormat;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class OrganizationAsker {

    private Idshka id = new Idshka();


    public static final Scanner scanner = new Scanner(System.in);
//    private Object FileManager_1;


    public Organization createOrganization() {

        private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

        private String name = null; //Поле не может быть null, Строка не может быть пустой
        while (name == null) {
            try{
                System.out.println("Введите имя организации: ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new EmptyIO();
                if (nm.equals("")) throw new EmptyIO();
                if (nm.contains(";")) throw  new WrongFormat();
                name = nm;
            }
            catch (EmptyIO e)
            {
                System.out.println("Организация обязательно должна иметь имя!");
            }catch (NoSuchElementException exception) {
                System.out.println("Не понятно! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Не используйте \";\"");
            }
        }

        Float x; //Максимальное значение поля: 754, Поле не может быть null
        while (true) {
            try{
                System.out.println("Укажите значение координаты X: ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (name.equals("")) throw new EmptyIO();
                x = Float.parseFloat(st);
                break;
            }
            catch (EmptyIO e)
            {
                System.out.println("Не может не быть!"); //не может быть пустым
            }catch (NumberFormatException exception) {
                System.out.println("Должно быть предлагаемого формата!"); //узнать формат
            }catch (NoSuchElementException exception) {
                System.out.println("Такого элемента нет!");
            }
        }

        float y;
        while (true) {
            try{
                System.out.println("Укажите значение координаты Y: ");
                String st =scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (st.equals("")) throw new EmptyIO();
                y = Float.parseFloat(st);
                break;
            }
            catch (EmptyIO e)
            {
                System.out.println("Не может не быть!");
            }catch (NumberFormatException exception) {
                System.out.println("Должно быть предлагаемого формата!!");
            }catch (NoSuchElementException exception) {
                System.out.println("Такого элемента нет!");
            }
        }

        float annualTurnover;
        while (true) {
            try{
                System.out.println("Какой годовой оборот компании вы хотели бы иметь? : ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (st.equals("")) throw new EmptyIO();
                annualTurnover = Float.parseFloat(st);
                if (annualTurnover < 0 ||  annualTurnover > 3.4028235E38) throw new WrongFormat();
                break;
            }
            catch (EmptyIO e)
            {
                System.out.println("Годовой оборот не может быть нулевым!");
            }catch (WrongFormat e){
                System.out.println("Оборот должен лежать в пределах от 0 до 3.4028235E38 ");
            }catch (NumberFormatException exception) {
                System.out.println("Пожалуйста, введите подходящую сумму: ");
            }catch (NoSuchElementException exception) {
                System.out.println("Элемент не обнаружен");
            }
        }

        String partNumber = null;
        while (partNumber == null) {
            try{
                System.out.println("Write the PartNumber: ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new EmptyIO();
                if (nm.equals("")) throw new EmptyIO();
                if (nm.contains(";")) throw  new WrongFormat();
                partNumber = nm;
            }
            catch (EmptyIO e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }
        UnitOfMeasure unitOfMeasure;
        while (true) {
            try{
                System.out.println("Write Unit of Measurement:");
                System.out.println(java.util.Arrays.asList(UnitOfMeasure.values()));
                String st = scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (st.equals("")) throw new EmptyIO();
                unitOfMeasure = UnitOfMeasure.valueOf(st);
                break;
            }
            catch (EmptyIO e) {
                System.out.println("Cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("NO Such Element!");
            }catch (IllegalArgumentException exception) {
                System.out.println("NOt in the List!");
            }
        }


        String mname = null;
        while (mname == null) {
            try{
                System.out.println("Wrtie the Name of Manufacturar ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new EmptyIO();
                if (nm.equals("")) throw new EmptyIO();
                if (nm.contains(";")) throw  new WrongFormat();
                mname = nm;
            }
            catch (EmptyIO e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }
        String fulname = null;
        while (fulname == null) {
            try{
                System.out.println("Write Fullname of Manufacturar ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new EmptyIO();
                if (nm.equals("")) throw new EmptyIO();
                if (nm.contains(";")) throw  new WrongFormat();
                fulname = nm;
            }
            catch (EmptyIO e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }

        OrganizationType organizationType;
        while (true) {
            try{
                System.out.println("Write Type of Organization: ");
                System.out.println(java.util.Arrays.asList(OrganizationType.values()));
                String st = scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (st.equals("")) throw new EmptyIO();
                organizationType=OrganizationType.valueOf(st);
                break;
            }
            catch (EmptyIO e) {
                System.out.println("Cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("NO Such Element!");
            }catch (IllegalArgumentException exception) {
                System.out.println("NOt in the List!");
            }
        }
        String street = null;
        while (street == null) {
            try{
                System.out.println("Wrtie Address");
                System.out.println("Write the street Name: ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new EmptyIO();
                if (nm.equals("")) throw new EmptyIO();
                if (nm.contains(";")) throw  new WrongFormat();
                street = nm;
            }
            catch (EmptyIO e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }
        String zipcode = null;
        while (zipcode == null) {
            try{
                System.out.println("Write ZIPCODE: ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new EmptyIO();
                if (nm.equals("")) throw new EmptyIO();
                if (nm.contains(";")) throw  new WrongFormat();
                zipcode= nm;
            }
            catch (EmptyIO e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }
        Double tx;
        while (true) {
            try{
                System.out.println("Enter information about Town");
                System.out.println("Enter x(double) of your Town: ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (st.equals("")) throw new EmptyIO();
                tx = Double.parseDouble(st);
                if (tx < 0 || tx > 191928932) throw new WrongFormat();
                break;
            }
            catch (EmptyIO e)
            {
                System.out.println("Cant be Empty");
            }catch (WrongFormat e){
                System.out.println("Incorrect Format, Number should be bigger then 0 and smaller then 191928932");
            }catch (NumberFormatException exception) {
                System.out.println("Please write in right Format");
            }catch (NoSuchElementException exception) {
                System.out.println("No Such Element");
            }
        }
        Integer ty;
        while (true) {
            try{
                System.out.println("Enter y of your Town: ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (st.equals("")) throw new EmptyIO();
                ty = Integer.parseInt(st);
                if (ty < 0 || ty > 191928932) throw new WrongFormat();
                break;
            }
            catch (EmptyIO e)
            {
                System.out.println("Cant be Empty");
            }catch (WrongFormat e){
                System.out.println("Incorrect Format, Number should be bigger then 0 and smaller then 191928932");
            }catch (NumberFormatException exception) {
                System.out.println("Please write in right Format");
            }catch (NoSuchElementException exception) {
                System.out.println("No Such Element");
            }
        }
        float tz;
        while (true) {
            try{
                System.out.println("Enter z of your Town: ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new EmptyIO();
                if (st.equals("")) throw new EmptyIO();
                tz = Float.parseFloat(st);
                if (tz < 0 || tz > 191928932) throw new WrongFormat();
                break;
            }
            catch (EmptyIO e)
            {
                System.out.println("Cant be Empty");
            }catch (WrongFormat e){
                System.out.println("Incorrect Format, Number should be bigger then 0 and smaller then 191928932");
            }catch (NumberFormatException exception) {
                System.out.println("Please write in right Format");
            }catch (NoSuchElementException exception) {
                System.out.println("No Such Element");
            }
        }
        String tname = null;
        while (tname == null) {
            try{
                System.out.println("Write the Town Name: ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new EmptyIO();
                if (nm.equals("")) throw new EmptyIO();
                if (nm.contains(";")) throw  new WrongFormat();
                tname = nm;
            }
            catch (EmptyIO e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }

        return new Organization(
                id.nextLong(1_000_000),
                name,
                new Coordinates(x, y),
                LocalDate.now(),
              annualTurnover(),
                fullName,
                employeesCount,
                organizationType,
                postalAddress,

                )
        );
    }
}
