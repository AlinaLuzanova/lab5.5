package Commands;

import Collection.CollectionManager;

import java.io.IOException;
import java.util.regex.PatternSyntaxException;

public class CountLessThanPostalAddress implements Command{
    private CollectionManager collectionManager;

    public CountLessThanPostalAddress(CollectionManager collectionManager)
    {
      this.collectionManager=collectionManager;
    }

    public boolean execute(String argument) {
        try{
            if (argument.isEmpty()) throw new IOException();
            String info = collectionManager.CountLessThanPostalAddress(argument.trim());
            if (info.isEmpty())
            {
                System.out.println("Nothing like it in collection");
                return true;
            }
            else
            {
                System.out.println(info);
                return true;
            }

        } catch (PatternSyntaxException e)
        {
            System.out.println("Incorrect pattern");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void execute(String[] args, boolean fromFile) {

    }
//    private CollectionManager cm;
//    public count_greater_than_part_number(CollectionManager cm){
//        this.cm=cm;
//    }
//    public boolean execute(String a){
//        cm.count_greater_than_part_number(a);
//        return true;
//    }
}