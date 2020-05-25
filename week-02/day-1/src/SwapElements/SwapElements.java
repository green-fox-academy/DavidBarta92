package SwapElements;

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        String temp = orders[0];
        orders[0]= orders [2];
        orders[2]= temp;

        for (byte i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
    }
}
