package SubInt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SubInt2 {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        int num = userNum.nextInt();
        int[] listOfNumbers = {1, 11, 34, 52, 61};
        subInt(num, listOfNumbers);
    }
    public static void subInt(int num, int[] listOfNumbers) {
        try{
            ArrayList<Integer> result = new ArrayList<>();
            String sNum = Integer.toString(num);
            char cNum = sNum.charAt(0);
            for (int i =0; i < listOfNumbers.length; i++){
                String sElement = Integer.toString(listOfNumbers[i]);
                char[] cElements = new char[sElement.length()];
                for(int j=0; j < sElement.length(); j++){
                    cElements[j] = sElement.charAt(j);
                    int comp;
                    for (int k = 0; k < cElements.length; k++){
                        comp = Character.compare(cElements[j], cNum);
                        if (comp == 0){
                            result.add(i);
                        }
                    }
                }
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            System.out.println("Csak szamot adhatsz meg!");
        }
    }
}
