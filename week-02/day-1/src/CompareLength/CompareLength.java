package CompareLength;

public class CompareLength {
    public static void main(String[] args) {
        int[] firstArrayOfNumbers = {1,2,3};
        int[] secondArrayOfNumbers = {4,5};

        if (firstArrayOfNumbers.length < secondArrayOfNumbers.length){
            System.out.print("secondArrayOfNumbers is longer");
        }
        else{
            System.out.print("firstArrayOfNumbers is longer");
        }
    }
}
