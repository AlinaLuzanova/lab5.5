package Commands;

public class exit extends AbstractCommand{
    public boolean execute(){
        System.exit(0); //Завершает работу запущенной в данный момент виртуальной машины Java.
        return true;
    }
}