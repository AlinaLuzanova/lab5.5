package Commands;

public class info extends AbstractCommand{
    private final CollectionManager collectionManager;
    public info(CollectionManager c){
        this.collectionManager=c;
    }
    public boolean execute_script() {
        System.out.println("Тип коллекции: Treeset");
        System.out.println("Дата создания: "+ collectionManager.getCreationDate());
        System.out.println("Номер элемента: "+ collectionManager.size());
        return true;
    }
}
