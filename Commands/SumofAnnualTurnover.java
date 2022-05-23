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
    @Override
    public String toString(){
        return "sum_of_annual_turnover  - вывести сумму значений поля annualTurnover для всех элементов коллекции";
    }

}