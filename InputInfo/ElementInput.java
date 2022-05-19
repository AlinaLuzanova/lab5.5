package InputInfo;

import CheckCorrectData.CheckCorrectInput;
import Data.*;

import java.util.Scanner;

public class ElementInput {

    private String name;
    private String fullName;
    private String postalAddress;
    private OrganizationType type;
    private Float x;
    private float y;
    private float annualTurnover;
    private long employeesCount;
    private CheckCorrectInput check = new CheckCorrectInput();

    public void nameInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя: ");
            name = input.nextLine().trim();
            if (check.checkName(name) == 1) break;
            System.out.println("Некорректный ввод. Попробуйте еще раз.");
        }
    }

    public void xInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату x: ");
            if (input.hasNextFloat()) {
                x = input.nextFloat();
                if (check.checkCoordinateX(x) == 1) break;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxX(754));
        }
    }

    public void yInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату y: ");
            if (input.hasNextFloat()) {
                y = input.nextFloat();
                if (check.checkCoordinateY(y) == 1) break;
            }
            System.out.println("Неверный формат ввода");
        }
    }

    public void annualTurnoverInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Годовой оборот: ");
            if (input.hasNextFloat()) {
                annualTurnover = input.nextFloat();
                if(check.checkAnnualTurnover(annualTurnover) == 1) break;
            }
            System.out.println("Значение должно быть больше 0");
        }
    }

    public void employeesCountInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Количество сотрудников: ");
            if (input.hasNextLong()) {
                employeesCount = input.nextLong();
                break;
            }
            System.out.println("Значение должно быть больше 0");
        }
    }


    public void fullNameInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя саундтрека: ");
            fullName = input.nextLine().trim();
            if (check.checkFullName(fullName) == 1) break;
            System.out.println("Неправильный ввод. Строка должна быть не пустой!");
        }
    }

    public void organizationTypeInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите тип оружия. Возможные варианты - ");
           OrganizationType.outputOrganizationType();
            String inputOrganizationType = input.nextLine().trim();

            if (check.checkOrganizationType(inputOrganizationType)== 1) {
                type = type.valueOf(inputOrganizationType);
                break;
            }
            System.out.println("Введите слово из предложенного списка.");
        }
    }

    public void postalAddressInput() {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите марку машины: ");
            if (input.hasNextLine()) {
                postalAddress = input.nextLine().trim();
                if (check.checkAddress(postalAddress) == 1) break;
            }

            System.out.println("Некорректный ввод.");
        }
    }


    public Organization createElement(Long id) {
        return new Organization( id, name, new Coordinates(x, y),annualTurnover,
                fullName,  type, new Address(postalAddress));
    }

    public Organization resultElement(Long id) {
        nameInput();
        xInput();
        yInput();
        annualTurnoverInput();
        employeesCountInput();
        fullNameInput();
        organizationTypeInput();
        postalAddressInput();

        return createElement(id);
    }

}
