package Collection;

import Data.Organization;
import Data.OrganizationType;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;
/*
в этом классе прописаны методы классов интерактивных методов  и методы
необходимые для их работы
 */

public class CollectionManager {

    private final LocalDateTime creationDate = LocalDateTime.now();
    /*
    неизменяемый класс, который представляет объекты Date
    в формате по умолчанию yyyy-MM-dd.
     Мы можем использовать метод now(), чтобы получить текущую дату.
     */
    private Stack<OrganizationType> organizations;

    public CollectionManager(Stack<Organization> organization) {
        this.organizations = organizations;

    }

        public void show(){
            Iterator <Organization> iterator = organizations.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next().toString());
            }
        }

        public void add(Organization o) {
            organizations.add(o);
        }


    public boolean remove_by_id(Long id){
        boolean flag = false;
        for(Iterator <Organization> iterator = organizations.iterator();
            iterator.hasNext();){
            Organization organization = iterator.next();
            if(organization.getId() == id){
                flag = true;
                iterator.remove();
            }
        }
        return !flag; //что это значит
    }

        public void clear() {
            organizations.clear();
        }

//execute_script

        public void exit() {
            System.exit(2);
        }

        public void remove_first() {

        }

    public LocalDateTime getCreationDate() {
        return this.creationDate;







    }

    public CollectionManager(TreeSet<Organization> organization) {
    }
}