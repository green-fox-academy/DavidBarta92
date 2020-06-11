import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Reverse.path());
        ArrayList<String> content = new ArrayList<String>();
        for (int i = (lines.size())-1; i >= 0; i--){
            content.add(lines.get(i));
        }
        Files.write(Reverse.path(), content);
    }

    public static Path path(){
        try{
            Path path = Paths.get("C:\\Users\\MY\\Documents\\" +
                    "greenfox\\DavidBarta92\\week-04\\day-4\\reversed-order.txt");
            return path;
        } catch (Exception e){
            System.out.println("Unavailable file path.");
            return null;
        }
    }
}