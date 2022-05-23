package Commands;

import Collection.*;

public class Shuffle implements Command {
    private final CollectionManager collectionManager;

    public Shuffle(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[], boolean fromFile) {
        collectionManager.Shuffle(collectionManager);
    }

    @Override
    public String toString() {
        return "shuffle - выводит элементы в порядке возрастания";
    }

}