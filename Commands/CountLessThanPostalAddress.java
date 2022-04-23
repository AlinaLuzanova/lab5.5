
package Commands;

import Collection.CollectionManager;
import Data.Address;

public class CountLessThanPostalAddress implements Command{
    private final CollectionManager collectionManager;

    public CountLessThanPostalAddress(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String[] args, boolean fromFile) {
        String postalAddress = String.join(" ", args);// delimetr
        try {
            Address.valueOf(postalAddress); //сделать адрес
        } catch (Exception e) {
            System.out.println("Такого типа оружия не существует");
        }
        collectionManager.count_less_than_postal_address(postalAddress);
    }

    @Override
    public String toString() {
        return "count_less_than__type - выводит кол - во элементов, weapon type которых меньше заданного";
    }

}