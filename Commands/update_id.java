package Commands;

import Collection.CollectionManager;
import Collection.OrganizationAsker;
import Collection.InputChecker;

public class update_id extends AbstractCommand{
    private CollectionManager cm;
    private InputChecker ic;
    private OrganizationAsker ca;
    public update_id (CollectionManager cm, InputChecker ic, OrganizationAsker ca){
        this.cm=cm;
        this.ca=ca;
        this.ic=ic;
    }
    public boolean execute_script(String argument){
        if(ic.longValidCheck(argument,(long)0,Long.MAX_VALUE)){
            int id = Integer.parseInt(argument);
            if(cm.remove((long) id)){
                System.out.println("ID не существует. Пожалуйста, попробуйте другой ID !");
                return false;
            }
            cm.add_element(ca.createProduct());
            return true;
        }
        System.out.println("The inserting ID is not in valid range! Please insert Id greater than 0!");
        return false;
    }

}
