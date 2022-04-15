
package Collection;
import Data.*;
import java.io.IOException;
import exceptions.WrongFormat;

import java.time.LocalDate;
import java.util.*;

public class OrganizationAsker {

    private Idshka id = new Idshka();


    public static final Scanner scanner = new Scanner(System.in);
//    private Object FileManager_1;


    public OrganizationType createOrganization() {

        long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

        String name = null; //Поле не может быть null, Строка не может быть пустой
        while (name == null) {
            try {
                System.out.println("Введите имя организации: ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new IOException();
                if (nm.equals("")) throw new IOException();
                if (nm.contains(";")) throw new WrongFormat();
                name = nm;
            } catch (IOException e) {
                System.out.println("Организация обязательно должна иметь имя!");
            } catch (NoSuchElementException exception) {
                System.out.println("Не понятно! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Не используйте \";\"");
            }
        }

        Float x; //Максимальное значение поля: 754, Поле не может быть null
        while (true) {
            try {
                System.out.println("Укажите значение координаты X: ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new IOException();
                if (name.equals("")) throw new IOException();
                x = Float.parseFloat(st);
                break;
            } catch (IOException e) {
                System.out.println("Не может не быть!"); //не может быть пустым
            } catch (NumberFormatException exception) {
                System.out.println("Должно быть предлагаемого формата!"); //узнать формат
            } catch (NoSuchElementException exception) {
                System.out.println("Такого элемента нет!");
            }
        }

        float y;
        while (true) {
            try {
                System.out.println("Укажите значение координаты Y: ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new IOException();
                if (st.equals("")) throw new IOException();
                y = Float.parseFloat(st);
                break;
            } catch (IOException e) {
                System.out.println("Не может не быть!");
            } catch (NumberFormatException exception) {
                System.out.println("Должно быть предлагаемого формата!!");
            } catch (NoSuchElementException exception) {
                System.out.println("Такого элемента нет!");
            }
        }

        float annualTurnover;
        while (true) {
            try {
                System.out.println("Какой годовой оборот компании вы хотели бы иметь? : ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new IOException();
                if (st.equals("")) throw new IOException();
                annualTurnover = Float.parseFloat(st);
                if (annualTurnover < 0 || annualTurnover > 3.4028235E38) throw new WrongFormat();
                break;
            } catch (IOException e) {
                System.out.println("Годовой оборот не может быть нулевым!");
            } catch (WrongFormat e) {
                System.out.println("Оборот должен лежать в пределах от 0 до 3.4028235E38 ");
            } catch (NumberFormatException exception) {
                System.out.println("Пожалуйста, введите подходящую сумму: ");
            } catch (NoSuchElementException exception) {
                System.out.println("Элемент не обнаружен");
            }
        }
    }
}
/*
        String fullName = null;
        while (fullName == null) {
            try{
                System.out.println("Укажите полное имя : ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new IOException();
                if (nm.equals("")) throw new IOException();
                if (nm.contains(";")) throw  new WrongFormat();
                fullName = nm;
            }
            catch (IOException e)
            {
                System.out.println("Организация не может не иметь полного имени! Укажите его Ж");
            }catch (NoSuchElementException exception) {
                System.out.println("всё ещё не понятно! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Не используйте \";\"");
            }
        }
        UnitOfMeasure unitOfMeasure;
        while (true) {
            try{
                System.out.println("Write Unit of Measurement:");
                System.out.println(java.util.Arrays.asList(UnitOfMeasure.values()));
                String st = scanner.nextLine().trim();
                if (st == null) throw new IOException();
                if (st.equals("")) throw new IOException();
                unitOfMeasure = UnitOfMeasure.valueOf(st);
                break;
            }
            catch (IOException e) {
                System.out.println("Cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("NO Such Element!");
            }catch (IllegalArgumentException exception) {
                System.out.println("NOt in the List!");
            }
        }

*/
/*
        String mname = null;
        while (mname == null) {
            try{
                System.out.println("Wrtie the Name of Manufacturar ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new IOException();
                if (nm.equals("")) throw new IOException();
                if (nm.contains(";")) throw  new WrongFormat();
                mname = nm;
            }
            catch (IOException e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }
        String fullName = null;
        while (fullName == null) {
            try{
                System.out.println("Укажите полное имя ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new IOException();
                if (nm.equals("")) throw new IOException();
                if (nm.contains(";")) throw  new WrongFormat();
                fulname = nm;
            }
            catch (IOException e)
            {
                System.out.println("Пожалуйста, запишите полное имя!");
            }catch (NoSuchElementException exception) {
                System.out.println("Не понятно! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Не используйте \";\"");
            }
        }

        OrganizationType organizationType;
        while (true) {
            try{
                System.out.println("Укажите тип ООрганизации: ");
                System.out.println(java.util.Arrays.asList(OrganizationType.values()));
                String st = scanner.nextLine().trim();
                if (st == null) throw new IOException();
                if (st.equals("")) throw new IOException();
                organizationType=OrganizationType.valueOf(st);
                break;
            }
            catch (IOException e) {
                System.out.println("Не может быть пустым");
            }catch (NoSuchElementException exception) {
                System.out.println("Нет такого элемента!");
            }catch (IllegalArgumentException exception) {
                System.out.println("Нет в списке!");
            }
        }
        String street = null;
        while (street == null) {
            try{
                System.out.println("Укажите улицу");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new IOException();
                if (nm.equals("")) throw new IOException();
                if (nm.contains(";")) throw  new WrongFormat();
                street = nm;
            }
            catch (IOException e)
            {
                System.out.println("Организация не может не иметь улицу");
            }catch (NoSuchElementException exception) {
                System.out.println("Не понятно! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Не используйте \";\"");
            }
        }
        String zipCode = null;
        while (zipCode == null) {
            try{
                System.out.println("Запишите ZIPCODE: ");
                String nm = scanner.nextLine().trim();
                if (nm == null) throw new IOException();
                if (nm.equals("")) throw new IOException();
                if (nm.contains(";")) throw  new WrongFormat();
                zipcode= nm;
            }
            catch (IOException e)
            {
                System.out.println("Организация не может не иметь zipCode");
            }catch (NoSuchElementException exception) {
                System.out.println("Не понятно! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Не используйте \";\"");
            }
        }
        double tx;
        while (true) {
            try{
                System.out.println("укажите координату Х для своей организации : ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new IOException();
                if (st.equals("")) throw new IOException();
                tx = Double.parseDouble(st);
                if (tx < 0 || tx > 191928932) throw new WrongFormat();
                break;
            }
            catch (IOException e)
            {
                System.out.println("Не может не иметь координаты Х");
            }catch (WrongFormat e){
                System.out.println("Неверный формат, Значение должно быть больше 0 и меньше  191928932");
            }catch (NumberFormatException exception) {
                System.out.println("Порробуйте ещё раз в правильном формате");
            }catch (NoSuchElementException exception) {
                System.out.println("Такого элемента нет");
            }
        }
        //проверить и переделать всё ниже
        Long ty;
        while (true) {
            try{
                System.out.println("Enter y of your Town: ");
                String st = scanner.nextLine().trim();
                if (st == null) throw new IOException();
                if (st.equals("")) throw new IOException();
                ty = Long.parseLong(st);
                if (ty < 0 || ty > 191928932) throw new WrongFormat();
                break;
            }
            catch (IOException e)
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
                if (st == null) throw new IOException();
                if (st.equals("")) throw new IOException();
                tz = Float.parseFloat(st);
                if (tz < 0 || tz > 191928932) throw new WrongFormat();
                break;
            }
            catch (IOException e)
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
                if (nm == null) throw new IOException();
                if (nm.equals("")) throw new IOException();
                if (nm.contains(";")) throw  new WrongFormat();
                tname = nm;
            }
            catch (IOException e)
            {
                System.out.println("Please write sth cant be Empty");
            }catch (NoSuchElementException exception) {
                System.out.println("Couldnt understand! ");
            } catch (WrongFormat wrongFormat) {
                System.out.println("Dont use \";\"");
            }
        }

        return new OrganizationType(
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
