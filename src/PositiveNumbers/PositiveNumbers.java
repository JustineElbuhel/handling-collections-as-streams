package PositiveNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers. (Typing 'end' will stop)");

        List<Integer> newList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(input));
            newList = positive(numbers);
        }

        for (Integer number : newList){
            System.out.println(number);
        }
    }

    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> values = numbers.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return values;
    }
}
