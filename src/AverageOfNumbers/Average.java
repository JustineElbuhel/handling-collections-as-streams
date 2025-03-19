package AverageOfNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers. (Type 'end' to stop)-1");

        while(true){
            String input = scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            numbers.add(input);
        }

        double average = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .average()
                .getAsDouble();

        System.out.println("Average of numbers entered: " + average);
    }
}
