package InputInfo;

import java.io.File;
import java.util.Scanner;

public class FileInputInformation {

    public void input() {
        while(true) {
            Scanner fileNameInput = new Scanner(System.in);
            System.out.print("Введите путь до файла: ");
            String s = fileNameInput.nextLine();

            File file = new File(s);

            if (file.isDirectory()) {
                System.out.println("Вы ввели путь до директории, а не файла." + "\n");
                continue;
            }

            if (!file.exists()) {
                System.out.println("Такого файла не существует. Проверьте ввод." + "\n");
                continue;
            }
             return ;

        }
    }
}