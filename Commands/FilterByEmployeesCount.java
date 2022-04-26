package Commands;

import Collection.CollectionManager;

public class FilterByEmployeesCount implements Command {

    private final CollectionManager collectionManager;

    public FilterByEmployeesCount(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String[] args, boolean fromFile) {

    }
}