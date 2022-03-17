package Commands;

import Collection.*;
import Collection.OrganizationAsker;

public class add extends AbstractCommand{
    private CollectionManager cm;
    private OrganizationAsker ca;
    public add(CollectionManager cm, OrganizationAsker ca){
        this.cm=cm;
        this.ca=ca;
    }
    public boolean execute_script(){
        cm.add(ca.createProduct());
        return true;
    }
}
