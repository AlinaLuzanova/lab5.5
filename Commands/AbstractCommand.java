package Commands;



abstract class AbstractCommand implements Commands{
    public boolean execute_script(String argument){
        return false;
    }

    public boolean execute(){
        return false;
    }

}



