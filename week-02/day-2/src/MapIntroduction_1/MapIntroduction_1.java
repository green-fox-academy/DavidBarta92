package MapIntroduction_1;

import java.util.HashMap;

public class MapIntroduction_1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> characters = new HashMap<>();
        if (characters.size() > 0) {
            System.out.println("not empty");
        }
        else {
            System.out.println("empty");
        }
        characters.put(97, 'a');
        characters.put(98, 'b');
        characters.put(99, 'c');
        characters.put(65, 'A');
        characters.put(66, 'B');
        characters.put(67, 'C');
        System.out.println(characters.keySet());
        System.out.println(characters.values());
        characters.put(68, 'D');
        System.out.println(characters.size());
        System.out.println(characters.get(99));
        characters.remove(97);
        System.out.println(characters.containsKey(100));
        characters.clear();
    }
}
