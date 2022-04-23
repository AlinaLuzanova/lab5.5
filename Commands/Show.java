package Commands;

import Collection.*;

public class Show implements Command {

    private final CollectionManager collectionManager;

    public Show(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[], boolean fromFile) {
        collectionManager.show();
    }

    @Override
    public String toString() {
        return "Commands.Show - выводит все элементы коллекции в строковом представлении";
    }
}