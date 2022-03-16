import java.io.*;
import java.util.*;



public class CollectionManager {
//сюда че то написать
    {

        Map<String, String> manual = new HashMap<String, String>();
        manual.put("help", "вывести справку по доступным командам");
        manual.put("info", "вывести в стандартный поток вывода информации о коллекции.");
        manual.put("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        manual.put("add", "добавить новый элемент в коллекцию");
        manual.put("update id", "обновить значение элемента коллекции, id которого равен заданному");
        manual.put("remove_by_id", "удалить элемент из коллекции по его id");
        manual.put("clear", "очистить коллекцию");
        manual.put("save", "сохранить коллекцию в файл");
        manual.put("execute_script file_name", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
        manual.put("exit", "завершить программу (без сохранения в файл)");
        manual.put("remove_first", "удалить первый элемент из коллекции");
        manual.put("shuffle", "перемешать элементы коллекции в случайном порядке");
        manual.put("history", " вывести последние 12 команд (без их аргументов)");
        manual.put("sum_of_annual_turnover", "вывести сумму значений поля annualTurnover для всех элементов коллекции");
        manual.put("count_less_than_postal_address", "вывести количество элементов, значение поля postalAddress которых меньше заданного");
        manual.put("filter_by_employees_count", "вывести элементы, значение поля employeesCount которых равно заданному");
    }

    //нид э хелп виз хелп

//почему у него нет инфо

    public void show() {
        if (citizens.size() != 0) citizens.forEach(p -> System.out.println(serializer.toJson(p) + " hashCode=" + p.hashCode()));
        else System.out.println("Коллекция пуста.");
    }

    //много правок
    public void add(String person) {
        try {
            if (citizens.add(serializer.fromJson(person, Shorty.class))) {
                System.out.println("Элемент успешно добавлен.");
                save();
            }
        } catch (JsonSyntaxException ex) {
            System.out.println("Ошибка синтаксиса Json. Не удалось добавить элемент.");
        }
    }

//апдейт бай ай ди
    // ремув бай ай ди

    public void clear() {
        citizens.clear();
        System.out.print("Коллекция очищена.");
        save();
    }

    public void save() {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream((jsonCollection))))) {
            writer.write(serializer.toJson(citizens));
        } catch (Exception ex) {
            System.out.println("Возникла непредвиденная ошибка. Коллекция не может быть записана в файл.");
        }
    }


    //execute_script file_name

//exit

    public void remove_first() {
        try {
            citizens.first();
            System.out.println("Первый элемент коллекции удалён.");
            save();
        }
        catch (NoSuchElementException ex) {
            System.out.println("Нельзя удалить первый элемент коллекции. Коллекция пуста.");
        }

    }

//shuffle
//history
    //sum_of_annual_turnover
    //count_less_than_postal_addres
    //filter_by_employees_count

}
