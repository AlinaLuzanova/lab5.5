package Commands;

import Collection.*;

public class Info implements Command {

    private final CollectionManager collectionManager;

    public Info(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[], boolean fromFile) {
        collectionManager.info();
    }

    @Override
    public String toString() {
        return "info - выводит информацию о коллекции (тип, дата инициализации и тд)";
    }
}