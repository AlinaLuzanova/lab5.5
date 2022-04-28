package Collection;

import Data.Organization;
import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Organization organization = new Organization();
        organization.setEmployeesCount(5);
        Gson g = new Gson();
        String nameOrg = g.toJson(organization);
        System.out.println(nameOrg);
        //записать эту строчку в файл с помощью класса java.io.OutputStreamWriter
        //
    }

}


}

