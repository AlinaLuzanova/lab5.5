package Collection;

import Data.Organization;
import InputInfo.ElementInput;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Stack;

public class CollectionManager {
    Stack<Organization> collection = new Stack<>();
    private Long id = 1L;
    LocalDate initTime = LocalDate.now();

    public Long getId() {
        return id++;
    }

    public void mergeCollections(Stack<Organization> collectionFromFile) {
        collection.addAll(collectionFromFile);
    }

    /*public void save() {
        Parser parserToXml = new ParserToXml();
        parserToXml.parseToXml(collection);
    }*/

    public void info() {
        System.out.println("Тип - " + collection.getClass() + "\n"
                + "Количество элементов - " + collection.size() + "\n"
                + "Дата инициализации - " + initTime);
    }

    public void Shuffle(CollectionManager collectionManager) { // проблема с джсоном
        Collections.sort(collection);
        if (collection.peek().compareTo(Item) >= 0) collection.pop(ElementInput);
    }


    public String CountLessThanPostalAddress(String type) {
        int amount = 0;
        for(Organization element: collection) {
            if (element.getOrganizationType().length() < type.length()) {
                amount++;
            }
        }
        System.out.println(amount);
        return type;
    }

    public void removeFirst() {
        collection.pop();
    }

    public void show() {
        System.out.println(collection);
    }

    public void clear() {
        collection.clear();
    }

    public void add(Organization element) {
        collection.add(element);
    }

    public boolean updateById(Long updateId) {
        for(Organization element: collection) {
            if (element.getId() == updateId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }

    public boolean removeById(Long deleteId) {
        for(Organization element: collection) {
            if (element.getId() == deleteId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }

}