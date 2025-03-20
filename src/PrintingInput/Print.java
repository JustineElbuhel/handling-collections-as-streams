package PrintingInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Print {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            strings.add(input);
        }

        //Prints inputs using .reduce method
        String combined = strings.stream()
                .reduce("",(previous, value) -> previous + value + "\n");

        System.out.println(combined);

        System.out.println();

        //Prints inputs using .forEach method
        strings.stream()
                .forEach(x -> System.out.println(x));
    }
}
