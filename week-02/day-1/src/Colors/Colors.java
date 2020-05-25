package Colors;

public class Colors {
    public static void main(String[] args) {
        String[][] colors = {{"lime", "forest green", "olive", "pale green", "spring green"},{"orange red", "red", "tomato"},{"orchid", "violet", "pink", "hot pink"}};
        for (byte row  = 0; row < colors.length; row++) {
            for (byte col = 0; col < colors[row].length; col++) {
                System.out.print(colors[row][col] + ", ");
            }
            System.out.println();
        }
    }

}
