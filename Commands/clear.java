package Commands;

import Collection.CollectionManager;
public class clear extends AbstractCommand{

    private CollectionManager collectionManager;

    public clear(CollectionManager C){
        this.collectionManager = C;
    }
    @Override
    public boolean execute() {
        collectionManager.clear();
        return true;
    }
}

