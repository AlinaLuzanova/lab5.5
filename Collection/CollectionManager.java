package Collection;

import Commands.ExecuteScript;
import Data.Organization;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CollectionManager {
    Stack<Organization> collection = new Stack<>();
    private Long id = 1L;
    private final String filepath;

    LocalDate initTime = LocalDate.now();

    public CollectionManager(String filepath){
        this.filepath = filepath;
    }

    public Long getId() {
        return id++;
    }

    public void mergeCollections(Stack<Organization> collectionFromFile) {
        collection.addAll(collectionFromFile);
    }

    public void info() {
        System.out.println("Тип - " + collection.getClass() + "\n"
                + "Количество элементов - " + collection.size() + "\n"
                + "Дата инициализации - " + initTime);
    }

    public void Shuffle(CollectionManager collectionManager) { // проблема с джсоном
        Collections.shuffle(collection);
        System.out.println("Команда выполнена");
        //TODO: исправить
//       if (collection.peek().compareTo(Item) >= 0) collection.pop(ElementInput);
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
        for (Organization element : collection) {
            if (element.getId() == updateId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }

    public void save() {
        Gson g = new Gson();
        String nameOrg = g.toJson(collection);
        System.out.println(nameOrg);
        try (FileOutputStream os = new FileOutputStream(filepath)) {
            OutputStreamWriter output = new OutputStreamWriter(os);
            output.write(nameOrg);
            output.flush();
        } catch (FileNotFoundException exp) {
            System.out.println(exp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean removeById(Long deleteId) {
        for (Organization element : collection) {
            if (element.getId() == deleteId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }
    public Organization [] filter_by_employees_count(long employ){
        List<Organization> list = new LinkedList<>();
        for (Organization org:collection) {
            if(org.getEmployeesCount() ==employ ){
                list.add(org);
            }
        }

        return filter_by_employees_count(employ) ;
    }
    public void history(){

    }

    public void execute(String line, ExecuteScript executeScript) {
    }
}