package done.funcionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsExample {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Sarah");
        List<String> newNames = new ArrayList<>();

        for (String name : names) {
            newNames.add(name.toLowerCase());
        }
        System.out.println(newNames);

        String first = names.stream()
                .map((name) -> name.toLowerCase())
                .filter((name) -> name.equals("adssa"))
                .map((name) -> name.toUpperCase())
                .limit(10)
                .findFirst()
                .orElse("Barack Obama");
        System.out.println(first);

        Optional<String> barrack = Optional.of("Barrack");
        barrack.ifPresent( (name) -> System.out.println(name) );

        Optional<String> emptyBarrack = Optional.empty();
        emptyBarrack.ifPresent( (name) -> System.out.println(name));

        List.of("John", "Peter", "Sarah").stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
