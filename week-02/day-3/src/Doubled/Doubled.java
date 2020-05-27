package Doubled;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Doubled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.next();
        System.out.println("The decryption was successful: " + decoder(path1));

    }
    public static boolean decoder(String path1) {
        boolean success;
        try {
            Path file1Path = Paths.get(path1);
            List<String> docData = Files.readAllLines(file1Path);
            ArrayList<Character> docInChars = new ArrayList<>();
            for(int i =0; i < docData.size(); i++) {
                String element = docData.get(i);
                for(int j = 0; j < element.length(); j++) {
                    docInChars.add(element.charAt(j));
                }
            }
            ArrayList<Character> decryptedChars = new ArrayList<>();
            for(int i =0; i < docInChars.size(); i++) {
                if (i%2 == 0){
                    decryptedChars.add(docInChars.get(i));
                }
            }
            String s = null;
            for(int i =0; i < docInChars.size(); i++) {
                s = new StringBuilder().append(decryptedChars.get(i)).toString();
                }
            String[] doc = s.split(" ");
            ArrayList<String> docc = new ArrayList<String>(Arrays.asList(doc));
            Files.write(Paths.get(path1), docc);

            success = true;
        } catch (Exception e) {
            success = false;
        }
        return success;
    }
}
