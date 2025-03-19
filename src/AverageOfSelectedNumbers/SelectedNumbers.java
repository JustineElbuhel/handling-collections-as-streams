package AverageOfSelectedNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectedNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers. Type 'end to stop.");

        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            numbers.add(input);
        }

        System.out.println("Print the average of positive or negative numbers? (p/n)");
        String choice = scanner.nextLine();

        double average;
        if(choice.equals("p")){
            average = numbers.stream()
                    .mapToInt(x -> Integer.valueOf(x))
                    .filter(x -> x > 0)
                    .average()
                    .getAsDouble();
        } else {
            average = numbers.stream()
                    .mapToInt(x -> Integer.valueOf(x))
                    .filter(x -> x < 0)
                    .average()
                    .getAsDouble();
        }

        System.out.println(average);
    }
}
