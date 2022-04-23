package Collection;

import Data.Organization;
import Parser.ParserFromXml;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        FileM fileM = new FileM();

        TreeSet<Organization> products = fileM.readCSV();

        CollectionManager collectionManager = new CollectionManager(products);
        System.out.println("Welcome to program!");
        System.out.println("Type Help to start");
        InputChecker inputChecke = new InputChecker();


        CollectionManager collectionManager = new CollectionManager();
        CommandsList commandsList = new CommandsList(collectionManager);

        if (args.length > 0) {
            ParserFromXml parserFromXml = new ParserFromXml();
            parserFromXml.parser();
            collectionManager.mergeCollections(parserFromXml.getCollection());
        }

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду");
            String command = input.nextLine();
            commandsList.execute(command, false);
        }
    }
}
