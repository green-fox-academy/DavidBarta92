package Homework;

public class Homework {
    public static void main(String[] args) {

        ArrayList<String> treeNames = new ArrayList<>(Arrays.asList("Oak","Apple","Baobab","Acacia","Akacia"));
        ArrayList<String> treeColors = new ArrayList<>(Arrays.asList("green","green","green","yellow","green"));
        ArrayList<Integer> treeAge = new ArrayList<>(22,50,2,100,10);
        ArrayList<boolean> treeSex = new ArrayList<>(true,true,true,true,false);



        ////////////////////////



        Tree fa1 = new Tree();
        fa1.type = "Oak";
        fa1.leafColor = "green";
        fa1.age = 22;
        fa1.male = true;

        Tree fa2 = new Tree();
        fa1.type = "Apple";
        fa1.leafColor = "green";
        fa1.age = 50;
        fa1.male = true;

        Tree fa3 = new Tree();
        fa1.type = "Baobab";
        fa1.leafColor = "green";
        fa1.age = 2;
        fa1.male = true;

        Tree fa4 = new Tree();
        fa1.type = "Acacia";
        fa1.leafColor = "yellow";
        fa1.age = 100;
        fa1.male = true;

        Tree fa5 = new Tree();
        fa1.type = "Akacia";
        fa1.leafColor = "green";
        fa1.age = 10;
        fa1.male = false;
    }
}
