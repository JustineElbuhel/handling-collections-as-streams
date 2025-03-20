package ReadingLinesFromFile;

import BookAuthors.Person;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] arggs){
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("src/text.txt"))
                    .forEach(row -> rows.add(row));
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }

        rows.stream()
                .forEach(row -> System.out.println(row));

        System.out.println();

        System.out.println("Presidents: ");
        List<Person> presidents = new ArrayList<>();

        try {
            Files.lines(Paths.get("src/people.txt"))
                    //Split the row into parts on the ";" character
                    .map(row -> row.split(";"))
                    //Delete split rows that have less than 2 parts
                    .filter(parts -> parts.length >= 2)
                    //Creating people from the parts
                    .map(parts -> new Person(parts[0], Integer.parseInt(parts[1].trim())))
                    //Finally add each person to the list
                    .forEach(person -> presidents.add(person));
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        presidents.stream()
                .forEach(president -> System.out.println(president));
    }
}
