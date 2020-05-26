package ListIntroduction_1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListIntroduction_1 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("William");
        System.out.println(names.size());
        if (names.size() > 0) {
            System.out.println("not empty");
        }
        else {
            System.out.println("empty");
        }
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.print(1+i + ". ");
            System.out.println(names.get(i));
        }
        names.remove(1);
        for (int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        names.clear();
    }
}
