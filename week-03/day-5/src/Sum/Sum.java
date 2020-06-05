package Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public int summation(List<Integer> numbers){
        int sum =0;
        for (int i =0; i < numbers.size(); i++){
            if (numbers.get(i) != null) {
                sum = sum + numbers.get(i);
            } else {
                sum = 0;
            }
        }
        return sum;
    }
}
