package WriteSingleLine;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newData = scanner.next();
        try {
            editor(newData);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
    public static void editor(String newData) throws IOException {
        List<String> content = new ArrayList();
        content.add(newData);
        Path filePath = Paths.get("./my-file.txt");
        Files.write(filePath, content);
    }
}