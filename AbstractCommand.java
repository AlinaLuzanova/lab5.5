
public interface Commands {
    boolean execute(String argument);
    boolean execute();
}
abstract class AbstractCommand implements Commands {

        public boolean execute(String argument){
            return false;
        }

        public boolean execute (){
            return false;
        }

    }

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


public class info extends AbstractCommand{
    private final CollectionManager collectionManager;
    public info(CollectionManager c){
        this.collectionManager=c;
    }
    public boolean execute() {
        System.out.println("Collection Type: Treeset");
        System.out.println("Date of Creation: "+ collectionManager.getCreationDate());
        System.out.println("Number of elements "+ collectionManager.size());
        return true;
    }
}


public class save extends AbstractCommand {
    private final CollectionManager cm;

    public save(CollectionManager cm) {
        this.cm = cm;
    }

    public boolean execute() {
        cm.save();
        return true;
    }
}


public class show extends AbstractCommand{
    private final CollectionManager cm;
    public show (CollectionManager c){
        this.cm=c;
    }
    public boolean execute(){
        cm.show();
        return true;
    }
}


public class update_id extends AbstractCommand{
    private CollectionManager cm;
    private InputChecker ic;
    private ProductAsker ca;
    public update_id (CollectionManager cm, InputChecker ic, ProductAsker ca){
        this.cm=cm;
        this.ca=ca;
        this.ic=ic;
    }
    public boolean execute(String argument){
        if(ic.longValidCheck(argument,(long)0,Long.MAX_VALUE)){
            int id = Integer.parseInt(argument);
            if(cm.remove((long) id)){
                System.out.println("Id doesn't exist. Please insert the existing id!");
                return false;
            }
            cm.add_element(ca.createProduct());
            return true;
        }
        System.out.println("The inserting ID is not in valid range! Please insert Id greater than 0!");
        return false;
    }

}
public class exit extends AbstractCommand{
    public boolean execute(){
        System.exit(0);
        return true;
    }
}



public class sum_of_annual_turnover extends AbstractCommand{
    private CollectionManager cm;
    public sum_of_annual_turnover(CollectionManager cm){
        this.cm=cm;
    }
    public boolean execute(){
        cm.sum_of_annual_turnover();
        return true;
    }
}







