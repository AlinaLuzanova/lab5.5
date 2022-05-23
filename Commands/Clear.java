package Commands;

import Collection.*;

public class Clear implements Command {

    private final CollectionManager collectionManager;

    public Clear(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[], boolean fromFile) {
        collectionManager.clear();
        CommandsList.addHistory("clear");
        System.out.println("Команда успешно выполнена");
    }
    public void getHelp() {
        System.out.println("clear : очистить коллекцию");
    }
    @Override
    public String toString() {
        return "clear - отчистить коллекцию";
    }
}
