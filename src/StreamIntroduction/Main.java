package StreamIntroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //Initialize the scanner and the list that the input is read into
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        //Read inputs
        while(true){
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        //Count the number of values divisible by 3
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();

        //Work out the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        //Print out the statistics
        System.out.println("Divisible by three: " + numbersDivisibleByThree);
        System.out.println("Average: " + average);

        //Create a new list that streamed values are added to
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(6);

        ArrayList<Integer> values = list.stream()
                .filter(x -> x > 5)
                .map(x -> x * 2)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println();
        System.out.println(values);
    }
}
