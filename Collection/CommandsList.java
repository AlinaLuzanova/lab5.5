package Collection;

import Commands.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

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

    public class execute implements Command {
        private CollectionManager cm;

        public execute(CollectionManager cm) {
            this.cm = cm;
        }

        public boolean execute(String arg) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arg))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.split(" ")[0].equals("srcexecute_script")) {
                        System.out.println(line);
                        //  cm.execute(line, this);
                    } else {
                        System.out.println("Invalid command");
                    }
                }
            } catch (IOException e) {
                System.out.println("File not found, please, input existent file");
            }
            return true;
        }

        @Override
        public void execute(String[] args, boolean fromFile) {

        }
    }
}