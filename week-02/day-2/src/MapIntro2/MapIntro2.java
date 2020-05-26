package MapIntro2;

import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class MapIntro2 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("978-1-60309-452-8","A Letter to do");
        map.put("978-1-60309-459-7","Lupus");
        map.put("978-1-60309-444-3","Red Panda and Moon Bear");
        map.put("978-1-60309-461-0","The Lab");

        for (String i : map.keySet() ) {
            System.out.println(map.get(i) + " (ISBN: " + i + ")");
        }

        map.remove("978-1-60309-444-3");
        map.remove("978-1-60309-461-0","The Lab");


        map.put("978-1-60309-450-4","They Called Us Enemy");
        map.put("978-1-60309-453-5","Why Did We Trust Him?");

        System.out.println(map.get("478-0-61159-424-8"));

        System.out.println(map.get("978-1-60309-453-5"));

    }
}
