package Collection;

import Data.OrganizationType;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;


public class CollectionManager {

    private final LocalDateTime creationDate = LocalDateTime.now();
    private TreeSet<OrganizationType> organizations;

    public CollectionManager(TreeSet<Organization> organization) {
        this.organizations = organizations;

/*читаем про итераторы это удаление элементов из коллекции
метод шоу показывает каждый след элемент коллекции и удаляет его
 */
 */
 */
        public void show() {
            Iterator <OrganizationType> iterator = organizations.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next().toString());
            }
        }

        public void add(OrganizationType o) {
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

    public CollectionManager(TreeSet<Organization> organization) {
    }
}