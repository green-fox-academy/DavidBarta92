package CopyFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.next();
        String path2 = scanner.next();
        System.out.println("The copy was successful: " + copy(path1, path2));
    }

    public static boolean copy(String path1, String path2) {
        boolean success;
        try {
            Path file1Path = Paths.get(path1);
            Path file2Path = Paths.get(path2);
            List<String> lines = Files.readAllLines(file1Path);
            Files.write(file2Path, lines);

            success = true;
        } catch (Exception e) {
            success = false;
        }
        return success;
    }
}
