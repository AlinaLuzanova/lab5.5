package Commands;

import Collection.CollectionManager;
public class Clear implements Commands{

    private CollectionManager collectionManager;

    public Clear(CollectionManager collectionManager){
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute() {
        collectionManager.clear();
    }
}

