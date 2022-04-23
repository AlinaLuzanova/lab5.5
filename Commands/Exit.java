package Commands;

public class Exit implements Command {

    @Override
    public void execute(String args[], boolean fromFile) {
        System.exit(0);
    }

    @Override
    public String toString() {
        return "exit - завершение программы";
    }
}