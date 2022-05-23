package Commands;

import Collection.CommandsList;

public class Exit implements Command {

    @Override
    public void execute(String args[], boolean fromFile) {
        System.exit(0);
        CommandsList.addHistory("exit");
        System.out.println("Команда успешно выполнена");
    }

    @Override
    public String toString() {
        return "exit - завершение программы";
    }
}