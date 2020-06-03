package postIt;

import java.awt.*;

public class postIt {
    Color backgroundColor;
    String text;
    Color textColor;

    public postIt(Color backgroundColor, String text, Color textColor){
        this.backgroundColor= backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public static void main(String[] args) {
        postIt note1 = new postIt(Color.orange,"Idea 1",Color.blue);
        postIt note2= new postIt(Color.pink,"Awesome",Color.black);
        postIt note3= new postIt(Color.yellow,"Superb!",Color.green);
    }
}
