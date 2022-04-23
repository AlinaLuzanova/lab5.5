package InputInfo;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputInformation {

    public Path input() {
        while(true) {
            Scanner fileNameInput = new Scanner(System.in);
            System.out.print("Введите путь до файла: ");
            Path pathInput = Path.of(fileNameInput.nextLine());

            if (!pathInput.isAbsolute()) {
                System.out.println("Это не абсолютный путь до файла." + "\n");
                continue;
            }

            File file = new File(String.valueOf(pathInput));

            if (file.isDirectory()) {
                System.out.println("Вы ввели путь до директории, а не файла." + "\n");
                continue;
            }

            if (!file.exists()) {
                System.out.println("Такого файла не существует. Проверьте ввод." + "\n");
                continue;
            }

            return pathInput;
        }
    }
}