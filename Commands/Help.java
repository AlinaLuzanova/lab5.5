package Commands;

import java.util.HashMap;

public class Help implements Command {
    private final HashMap<String, Command> commands;

    public Help(HashMap<String, Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(String args[], boolean fromFile) {
        for (Command description: commands.values()) {
            System.out.println(description.toString());
        }
    }

    @Override
    public String toString() {
        return "help - выводит справку по доступным командам";
    }
}


    }
}
