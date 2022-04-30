package Collection;

import Data.Address;
import Data.Coordinates;
import Data.Organization;
import Data.OrganizationType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
        Stack<Organization> stack = new Stack<>();
        Organization organization = new Organization(5, "Martin", new Coordinates(5f, 6f), 5f, "MartinL", OrganizationType.COMMERCIAL, new Address("Martnilox"));
        Organization organization2 = new Organization(6, "Martin521", new Coordinates(5f, 6f), 5f, "MartinL", OrganizationType.COMMERCIAL, new Address("Martnilox"));
        Organization organization3 = new Organization(8, "Marti512512n", new Coordinates(5f, 6f), 5f, "MartinL", OrganizationType.COMMERCIAL, new Address("Martnilox"));

        organization.setEmployeesCount(5);
        stack.add(organization);        stack.add(organization2);
        stack.add(organization3);

        Gson g = new Gson();
        String nameOrg = g.toJson(stack);

        System.out.println(nameOrg);

        try (FileOutputStream os = new FileOutputStream("/Users/elizavetagolubeva/IdeaProjects/lab5.5/Collection/Filetest.rtf")) {
            OutputStreamWriter output = new OutputStreamWriter(os);
            output.write(nameOrg);
            output.flush();
        } catch (FileNotFoundException exp) {
            System.out.println(exp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //записать эту строчку в файл с помощью класса java.io.OutputStreamWriter



        try (FileReader fr = new FileReader("/Users/elizavetagolubeva/IdeaProjects/lab5.5/Collection/Filetest.rtf")) {
            // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
            BufferedReader br = new BufferedReader(fr, 16384);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                Type listType = new TypeToken<Stack<Organization>>(){}.getType();

                Stack <Organization> organization1 = g.fromJson(line,listType);
                System.out.println(organization1);
            }
            br.close();


        } catch (FileNotFoundException exp1) {
            System.out.println(exp1);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }


}


