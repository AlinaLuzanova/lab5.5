package Collection;

import Commands.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.System.exit;

public class CommandsList {
    public final HashMap<String, Command> commands = new HashMap<>();

    public CommandsList(CollectionManager collectionManager) {
        commands.put("add", new Add(collectionManager));
        commands.put("info", new Info(collectionManager));
        commands.put("show", new Show(collectionManager));
        commands.put("update", new UpdateId(collectionManager));
        commands.put("remove_by_id", new RemoveById(collectionManager));
        commands.put("clear", new Clear(collectionManager));
        commands.put("remove_first", new RemoveFirst(collectionManager));
        commands.put("history", new History(collectionManager));
        commands.put("filter_by_employees_count", new FilterByEmployeesCount(collectionManager));
        commands.put("count_less_than_postal_address", new CountLessThanPostalAddress(collectionManager));
        commands.put("sum_of_annual_turnover", new SumofAnnualTurnover(collectionManager));
        commands.put("execute_script", new ExecuteScript(collectionManager));
        commands.put("save", new Save(collectionManager));
        commands.put("help", new Help(commands));
        commands.put("exit", new Exit());
        commands.put("shuffle", new Shuffle(collectionManager));
    }

    /**
     * Parsing commands and arguments
     *
     * @param command input command
     * @param fromFile from where command was inputted
     */
    public void execute(String command, boolean fromFile) {

        String commandCut[] = command.trim().split("\\s+");
        String commandName = commandCut[0];
        String args[] = Arrays.copyOfRange(commandCut, 1, commandCut.length);

        if (commands.containsKey(commandName)) {
            commands.get(commandName).execute(args, fromFile);
        } else {
            if (fromFile) {
                System.out.println("Некорректная команда " + commandName + ". Завершение программы.");
                exit(1);
            }
            System.out.println("Команда не найдена. Повторите ввод.");
        }
    }
}