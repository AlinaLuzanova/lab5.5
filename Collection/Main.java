package Collection;

import Data.Organization;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.exit;

public class Main {


    public static void main(String args[]) {

        Gson gson = new Gson();
        Stack<Organization> items = new Stack<>();

        if (args.length > 0) {
            CollectionManager collectionManager = new CollectionManager(args[0]);
            CommandsList commandsList = new CommandsList(collectionManager);

            try (FileReader fr = new FileReader(args[0])) {
                // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
                BufferedReader br = new BufferedReader(fr, 16384);
                String line;
                while ((line = br.readLine()) != null) {
                    Type listType = new TypeToken<Stack<Organization>>() {
                    }.getType();
                    items = gson.fromJson(line, listType);
                }
                br.close();
            } catch (FileNotFoundException exp1) {
                System.out.println(exp1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }


            collectionManager.mergeCollections(items);

            Scanner input = new Scanner(System.in);
            try {
                while (true) {
                    System.out.println("\n" + "Введите команду");
                    String command = input.nextLine();
                    commandsList.execute(command, false);
                }
            } catch (NoSuchElementException e) {
                System.out.println("Завершение программы");
                return;
            }

        } else {
            System.out.println("Не указан обязательный аргумент - файл.");
            exit(1);
        }



    }


}


