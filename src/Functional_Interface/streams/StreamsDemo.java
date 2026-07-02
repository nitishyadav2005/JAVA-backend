package Functional_Interface.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    static void main(String[] args) {
        // Streams --> Assembly line/ pipeline
        List<String>  items = Arrays.asList("Apple", "Banana", "Cherry");
        for(String fruit : items){
            System.out.println(fruit);
        }

        // using streams
        Stream<String> stream = items.stream();
        stream.forEach((item) -> System.out.println(item));

        System.out.println("Filtered fruits");
       /* Stream<String> stream1 = items.stream();
        Stream<String> filteredStream = stream1.filter(name -> name.startsWith("B"));
        filteredStream.forEach(System.out::println);*/

         items.stream()
                 .filter(name -> name.startsWith("B"))
                 .forEach(System.out::println);

         /*
         * use case
         *
         * 1. Filtering
         * 2. Mapping
         * 3. Aggregation
         * 4. Searching
         * 5. Iteration*/
    }
}
