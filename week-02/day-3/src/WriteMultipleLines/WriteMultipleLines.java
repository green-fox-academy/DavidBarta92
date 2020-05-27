package WriteMultipleLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newPath = scanner.next();
        String newWord = scanner.next();
        int newNum = scanner.nextInt();
        try {
            editor(newPath, newWord, newNum);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
    public static void editor(String newPath, String newWord, int newNum) throws IOException {
        List<String> content = new ArrayList();
        for (int i = 1; i <= newNum; i++) {
            content.add(newWord);
        }
        Path filePath = Paths.get(newPath);
        Files.write(filePath, content);
        System.out.println("File modification is done.");
    }
}
