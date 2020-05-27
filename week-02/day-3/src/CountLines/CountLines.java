package CountLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Scanner userFilePath = new Scanner(System.in);
        String newFilePath = userFilePath.next();
        try {
            System.out.println(reader(newFilePath));
        } catch (Exception e) {
            System.out.println("0");
        }
    }
    public static int reader(String newFilePath) throws IOException {
        Path filePath = Paths.get(newFilePath);
        List<String> lines = Files.readAllLines(filePath);
        int numOfLines = lines.size();
        return numOfLines;
    }
}
