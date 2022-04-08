package Commands;
import Collection.CollectionManager;
//разобраться с исключениями
public class count_less_than_postal_address {
    private CollectionManager collection;

    public count_less_than_postal_address(CollectionManager col)
    {
        collection = col;
    }

    public boolean execute(String argument) {
        try{
            if (argument.isEmpty()) throw new Exceptions.WrongFormat();
            String info = collection.count_less_than_postal_address(argument.trim()); //trim удаляет пробелы в начале и в конце строки
            if (info.isEmpty())
            {
                System.out.println("Нет подобного в этой коллекции");
                return true;
            }
            else
            {
                System.out.println(info);
                return true;
            }

        } catch (Exceptions.WrongFormat e){
            System.out.println("Incorrect Format");
        } catch (PatternSyntaxException e)
        {
            System.out.println("Incorrect pattern");
        }
        return true;
    }




}
