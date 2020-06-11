package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String oNO = scanner.nextLine();
        Calculator.calculate(oNO);

    }
    public static void calculate(String oNO){
        try{
            char[] operationAndOperand = oNO.toCharArray();
            char operation = 0;
            StringBuilder operand1 = new StringBuilder();
            boolean space = false;
            StringBuilder operand2 = new StringBuilder();
            for (int i = 0; i < operationAndOperand.length; i++){
                if (operationAndOperand[i] == 10 && i == 0){
                    operation = operationAndOperand[i];
                }
                else if (i == 1){

                }
                else if(operationAndOperand[(i)+1] != 32 && !space){
                    operand1.append(operationAndOperand[i]);
                }
                else if(operationAndOperand[(i)+1] == 32 && !space){
                    operand1.append(operationAndOperand[i]);
                    space = true;
                }
                else{
                    operand2.append(operationAndOperand[i]);
                }
            }
            ArrayList<Integer> operand = new ArrayList<>();
            int num1 = Integer.parseInt(operand1.toString());
            int num2 = Integer.parseInt(operand2.toString());
            if(operation == 43){
                System.out.println(num1 + num2);
            }
            else if (operation == 45){
                System.out.println(num1 - num2);
            }
            else if (operation == 42){
                System.out.println(num1 * num2);
            }
            else if (operation == 47){
                System.out.println(num1 / num2);
            }
        } catch (Exception e){
            System.out.println("ERROR");
        }

    }
}
