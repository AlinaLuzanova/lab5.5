package Commands;

import Collection.CollectionManager;

public class History implements Command {

    private final CollectionManager collectionManager;

    public History(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String[] args, boolean fromFile) {

    }
}