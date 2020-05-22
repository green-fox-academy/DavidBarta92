package TwoNumbers;

import javax.xml.bind.SchemaOutputResolver;
import java.net.SocketOption;

public class TwoNumbers {
    public static void main(String[] args) {
        short a = 13;
        short b = 22;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((float)b / (float)a);
        int c = b / a;
        System.out.println(c);
        System.out.println(b % a);


    }
}
