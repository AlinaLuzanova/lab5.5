package Commands;
//Создаём класс хелп который при вызове выводит функции всех остальных комманд в консоль
public class Help  extends AbstractCommand{
    public boolean execute() {
        System.out.println ("Help -  вывести справку по доступным командам");
        System.out.println ("Info - вывести в стандартный поток вывода информацию о коллекции" );
        System.out.println ("Show - вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        System.out.println ("Add - добавить новый элемент в коллекцию");
        System.out.println ("Update id - обновить значение элемента коллекции, id которого равен заданному");
        System.out.println ("Remove_by_id - удалить элемент из коллекции по его id");
        System.out.println ("Clear - очистить коллекцию");
        System.out.println ("Save - сохранить коллекцию в файл");
        System.out.println ("Execute_script - считать и исполнить скрипт из указанного файла");
        System.out.println ("Exit - завершить программу (без сохранения в файл)");
        System.out.println ("Remove_first - удалить первый элемент из коллекции");
        System.out.println ("Shuffle - перемешать элементы коллекции в случайном порядке");
        System.out.println ("History - вывести последние 12 команд (без их аргументов)");
        System.out.println ("Sum_of_annual_turnover - вывести сумму значений поля annualTurnover для всех элементов коллекции");
        System.out.println ("Count_less_than_postal_address - вывести количество элементов, значение поля postalAddress которых меньше заданного");
        System.out.println ("filter_by_employees_count - вывести элементы, значение поля employeesCount которых равно заданному");

        return true;

    }
}
