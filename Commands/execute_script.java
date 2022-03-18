package Commands;

import Collection.CollectionManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class execute_script  extends AbstractCommand{
    private CollectionManager cm;

    public execute_script (CollectionManager cm){
        this.cm=cm;
    }
    public boolean execute_script(String arg){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arg))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.split(" ")[0].equals("srcexecute_script")) {
                    System.out.println(line);
                    //  cm.execute(line, this);
                } else {
                    System.out.println("Invalid command");
                }
            }
        } catch (IOException e) {
            System.out.println("File not found, please, input existent file");
        }
        return true;
    }
}
