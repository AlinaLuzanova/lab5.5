package Commands;

import Collection.CollectionManager;

public class SumofAnnualTurnover implements Command {

    private final CollectionManager collectionManager;

    public SumofAnnualTurnover(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String[] args, boolean fromFile) {

    }
}