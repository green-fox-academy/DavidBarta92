package PrintEachLine;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        try {
            Path filePath = Paths.get("./my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
        } catch (Exception e){
            System.out.print("Unable to read file: my-file.txt");
        }
    }
}
