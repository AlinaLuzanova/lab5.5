package Commands;
//интерфейс, содержащий метод execute, который должна выполнять каждыая команда
public interface Commands {
    boolean execute_script(String argument);
    boolean execute_script();

}

