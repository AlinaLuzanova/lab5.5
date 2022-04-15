package Commands;
import Collection.CollectionManager;
/*
инфо выводит данные о коллекции
1) Тип коллекции мы можем прописать сами
2) дату создания колекшн менеджер получает с помощью спец метода
3) аналогично с размером
 */
public class info implements Commands{
    private final CollectionManager collectionManager;
    public info(CollectionManager c){
        this.collectionManager=c;
    }


    public void execute() {
        System.out.println("Тип коллекции: Stack");
        System.out.println("Дата создания: "+ collectionManager.getCreationDate());
        System.out.println("Колличество элементов: "+ collectionManager.size());

    }
}
