package Collection;

import java.io.*;
import java.util.*;
import Data.Product;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Pattern;



public class CollectionManager {

    private final LocalDateTime creationDate = LocalDateTime.now();
    private TreeSet<Organization> organizations;

    public CollectionManager(TreeSet<Organization> organization) {
        this.organizations = organizations;

//читаем про итераторы
        public void show() {
            Iterator <Organization> iterator = organizations.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next().toString());
            }
        }

        public void add(Organization o) {
            organizations.add(o);
        }


//Commands.update_id

        //remove_by_id

        public void clear() {
            organizations.clear();
        }

//execute_script

        public void exit() {
            System.exit(2);
        }

        public void remove_first() {

        }







    }
}