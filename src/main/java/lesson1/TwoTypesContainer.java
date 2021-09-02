package main.java.lesson1;

public class TwoTypesContainer <T,V>{
    private T first;
    private V second;

    public TwoTypesContainer(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    void showType(){
        System.out.println("First: " + first.getClass().getName() + " second" + second.getClass().getName());
    }
}
