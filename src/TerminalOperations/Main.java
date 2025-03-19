package TerminalOperations;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);

        //count method informs us how many values are in the stream
        System.out.println("Count: " +
                values.stream()
                        .count());

        System.out.println();

        //forEach method defines what is done to each list value and terminates stream processing
        values.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));

        System.out.println();

        //collect method puts new values into a new collection
        ArrayList<Integer> positives = values.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        positives.stream()
                .forEach(x -> System.out.println(x));

        System.out.println();

        //reduce method combines stream elements to some other form
        //format: reduce(*initialState*, (*previous*, *object*) -> *actions on the object*)
        int sum = values.stream()
                .reduce(2, (previousSum, value) -> previousSum + value);
        System.out.println(sum);

        System.out.println();

        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");

        String combined = words.stream()
                .reduce("Zero \n", (prevString, string) -> prevString + string + "\n");
        System.out.println(combined);
    }
}
