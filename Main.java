import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Commands commands = new Commands(new CollectionManager(System.getenv("Collman_Path")));
        commander.interactiveMod();
    }

}
