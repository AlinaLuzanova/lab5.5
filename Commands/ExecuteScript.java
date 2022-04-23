package Commands;

import Collection.CommandsList;
import InputInfo.FileInputInformation;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;

public class ExecuteScript implements Command{
    private final CommandsList commandsList;
    private final FileInputInformation fileInputInformation = new FileInputInformation();
    private HashSet<Path> filesName = new HashSet<>();

    public ExecuteScript(CommandsList commandsList) {
        this.commandsList = commandsList;
    }


    @Override
    public void execute(String args[], boolean fromFile) {
        Path path = null;
        try {
            if(!fromFile) {
                path = fileInputInformation.input();
            }
            else {
                if (args.length > 0) path = Path.of(args[0].trim());
                else {
                    System.out.println("Некорректный путь");
                    return;
                }
            }

            if (filesName.contains(path)) {
                System.out.println("Вы пытаетесь вызвать файл, который уже был вызван");
                return;
            }

            filesName.add(path);
            Scanner inputFromFile = new Scanner(path);
            while (inputFromFile.hasNext()){
                String command = inputFromFile.nextLine();
                commandsList.execute(command, true);
            }
            filesName.clear();
        }
        catch (IOException e) {
            System.out.println("Похоже кто - то безвольный раб и прав даже на файл не имеет");
        }
    }

    @Override
    public String toString() {
        return "execute_script - выполняет ваш скрипт";
    }
}