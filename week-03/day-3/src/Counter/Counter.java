package Counter;

public class Counter {
    int value;

    public Counter(){
        this.value = 0;
    }
    public Counter(int value){
        this.value = value;
    }
    public void add(int number){
        value = value + number;
    }
    public void add(){
        value++;
    }
    public int get(){
        return this.value;
    }
    public int reset(){
        value = 0;
        return value;
    }

}

