package Commands;

import Collection.CollectionManager;
public class show extends AbstractCommand{
    private final CollectionManager cm;
    public show (CollectionManager c){
        this.cm=c;
    }
    public boolean execute_script(){
        cm.show();
        return true;
    }
