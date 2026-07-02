package Functional_Interface.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStreamDemo {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //List: even number from numbers list
        //ITERATION 1
        List<Integer> evenNumber1 = new ArrayList<>();
        for(int num : numbers){
            if(num % 2 == 0){
                evenNumber1.add(num);
            }
        }
        System.out.println("Even number without streams: " +evenNumber1);

        // Iteration 2
        Stream<Integer> integerStream1 = numbers.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p2);
        List<Integer>   evenNumber2 = integerStream2.toList();
        System.out.println("Even numbers with streams 2: " + evenNumber2);

        // ITERATION 3
        List<Integer> evenNumbers3 = numbers.stream()
                .filter(p2)
                .toList();
        System.out.println("Even numbers with streams 3: " + evenNumbers3);

    }
    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int rem = integer%2;
            if(rem == 0)
                return true;
            return false;
        }
    };

    static Predicate<Integer> p2 = (integer) -> integer%2 == 0;
}
