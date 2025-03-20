package UniqueLastNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        while(true){
            System.out.println();
            System.out.println("Input personal information. ('quit' ends)");
            String start = scanner.nextLine();
            if(start.equals("quit")){
                break;
            }

            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter birth year: ");
            int birthYear = Integer.valueOf(scanner.nextLine());

            people.add(new Person(firstName, lastName, birthYear));
        }

        people.stream()
                .map(person -> person.getLastName())
                .sorted()
                .forEach(lastName -> System.out.println(lastName));
    }
}
