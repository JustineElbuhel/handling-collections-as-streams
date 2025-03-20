package BooksFromAFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get("src/books.txt"))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .forEach(book -> books.add(book));
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }

        books.stream()
                .forEach(book -> System.out.println(book));
    }
}
