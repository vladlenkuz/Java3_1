package main.java.lesson1;

public class TypedContainerApp1 {
    public static void main(String[] args) {
        TypedContainer<Integer> container1 = new TypedContainer<>(42);
        TypedContainer<Integer> container2 = new TypedContainer<>(197);
        System.out.println(container1.getObj()+ container1.getObj());

        int c1 = container1.getObj();

        TypedContainer<String> stringTypedContainer= new TypedContainer<>("typedString");

        String string = stringTypedContainer.getObj();
        System.out.println(string);

        container1.showType();
        stringTypedContainer.showType();

        TwoTypesContainer<String, Integer> twoTypesContainer = new TwoTypesContainer<>("str", 100);
        twoTypesContainer.showType();
    }
}
