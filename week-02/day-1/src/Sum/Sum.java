package Sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        int num = userNum.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int num){
        int result = 0;
        for (int i = 0; i <= num; i++) {
            result = result + i;
        }
        return result;
    }
}
