import Collection.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileM fileM = new FileM();

        TreeSet<Product> products = fileM.readCSV();

        CollectionManager collectionManager = new CollectionManager(products);
        System.out.println("Добро пожаловать!");
        System.out.println("Напечатайте  help, чтобы начать");
        InputChecker inputChecke = new InputChecker();
        OrganizationAsker commandAsker = new OrganizationAsker();
        CommandManager commandManager = new CommandManager(
                new Help(),
                new info(),
                new show(),
                new add (),
                new update_id(),
                new remove_by_id(),
                new clear(),
                new execute_script (),
                new exit(),
                new remove_first(),
                new shuffle(),
                new history (),
                new sum_of_annual_turnover(),
                new count_less_than_postal_address (),
                new filter_by_employees_count () );
        Commander commander = new Commander(commandManager, new Scanner(System.in), fileM);
        commander.interactiveMode();

    }
}
