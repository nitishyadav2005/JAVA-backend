package Optionals;

import java.util.Optional;

public class FunctionalInterface {
    static void main(String[] args) {
        Optional<String> name = Optional.of("java");
        Optional<String> nullOptional = Optional.ofNullable(null);

        // ifPresent()
        nullOptional.ifPresent(value -> {
            System.out.println(value);
        });

        // map()
        Optional<String> upperCase = nullOptional.map(String::toUpperCase);
        System.out.println(upperCase.orElse("default"));

        // filter()
//        Optional<String> temp = name.filter(n -> n.startsWith("J"));
//        temp.ifPresent(System.out::println);

        name.filter(n -> n.startsWith("J"))
                .ifPresent(System.out::println);

        //Combined Operations
        name.filter(n -> n.startsWith("j"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }
}
