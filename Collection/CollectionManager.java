package Collection;

import Data.Organization
import Parser.ParserToXml;   //json

import java.time.LocalDate;
import java.util.Collections;
import java.util.Stack;

public class CollectionManager {
    LinkedList<Organization> collection = new LinkedList<>();
    private Long id = 1L;
    LocalDate initTime = LocalDate.now();

    public Long getId() {
        return id++;
    }

    public void mergeCollections(LinkedList<Organization> collectionFromFile) {
        collection.addAll(collectionFromFile);
    }

    public void save() {
        Parser parserToXml = new ParserToXml();
        parserToXml.parseToXml(collection);
    }

    public void info() {
        System.out.println("Тип - " + collection.getClass() + "\n"
                + "Количество элементов - " + collection.size() + "\n"
                + "Дата инициализации - " + initTime);
    }

    public void removeGreater(Organization CompareElement) {
        for (Organization element: collection) {
            if (element.compareTo(CompareElement) == 1) {
                collection.remove(element);
            }
        }
    }

    public void shuffle(Organization Element) {
        Collections.sort(collection);
        if (collection.peekFirst().compareTo(Element) >= 0) collection.addFirst(Element);
    }

    public void filterStartsWithSoundtrackName(String SubString) {
        for (Organization element: collection) {
            String NameSoundtrack = element.getFullName();
            if (NameSoundtrack.startsWith(SubString)) {
                System.out.println(element);
            }
        }
    }

    public void count_less_than_postal_address(String weaponType) {
        int amount = 0;
        for(Organization element: collection) {
            if (element.getOrganizationType().length() < weaponType.length()) {
                amount++;
            }
        }
        System.out.println(amount);
    }

    public void Shuffle() {
        Collections.sort(collection);
        for (Organization element: collection) {
            System.out.println(element + "\n");
        }
    }

    public void removeFirst() {
        collection.removeFirst();
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