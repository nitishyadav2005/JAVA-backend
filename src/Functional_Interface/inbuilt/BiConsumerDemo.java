package Functional_Interface.inbuilt;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    static void main(String[] args) {
        BiConsumer<Integer, Integer>  addConsumer = (a,b) -> System.out.println(a+b);
        addConsumer.accept(10,30);
    }
}
