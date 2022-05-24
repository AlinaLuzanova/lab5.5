package Commands;

import Collection.CommandsList;

public class History implements Command {

    public static final int count = 11;     // количество выводимых команд

    public void execute() {
        CommandsList.getHistory();
        CommandsList.addHistory("history");
    }
    public void getHelp() {
        System.out.println("history : вывести последние" + count +" команд (без их аргументов)");
    }

    @Override
    public void execute(String[] args, boolean fromFile) {

    }
    @Override
    public String toString(){
        return "history  - вывести последние 12 команд (без их аргументов)";
    }
}