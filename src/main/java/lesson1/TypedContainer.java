package main.java.lesson1;

public class TypedContainer<T> {
    private T obj;

    public TypedContainer(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    /**
     * Напечать тип хранимого обьекта.
     */
    void showType(){
        System.out.println("Type is " + obj.getClass().getName());
    }
}
