package BookAuthors;

import java.util.ArrayList;
import java.util.List;

public class BooksAndAuthors {
    public static void main(String[] args){
        List<Book> books = getBooks();

        //Calculate the average of the authors' birth years
        double average = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();
        System.out.println("Average: "  + average);

        System.out.println();

        //Print out authors of the books with the word "Potter"
        books.stream()
                .filter(book -> book.getTitle().contains("Potter"))
                .map(book -> book.getAuthor())
                .distinct()
                .forEach(author -> System.out.println(author));

        System.out.println();

        //Print complex string representations
        //ex: Author: Book in alphabetical order
        books.stream()
                .map(book -> book.getAuthor() + ": " + book.getTitle())
                .sorted()
                .forEach(book -> System.out.println(book));

    }

    private static List<Book> getBooks() {
        Person rowling = new Person("J.K. Rowling", 1965);
        Book philosophersStone = new Book(rowling, "Harry Potter and the Philosopher's Stone", 223);
        Book chamberOfSecrets = new Book(rowling, "Harry Potter and the Chamber of Secrets", 251);
        Book prisonerOfAzkaban = new Book(rowling, "Harry Potter and the Prisoner of Azkaban", 317);

        Person tolkien = new Person("J.R.R. Tolkien", 1892);
        Book fellowshipOfTheRing = new Book(tolkien, "The Fellowship of the Ring", 464);
        Book twoTowers = new Book(tolkien, "The Two Towers", 400);
        Book returnOfTheKing = new Book(tolkien, "The Return of the King", 496);

        Person meyer = new Person("Stephanie Meyer", 1973);
        Book twilight = new Book (meyer, "Twilight", 544);
        Book newMoon = new Book (meyer, "New Moon", 464);
        Book eclipse = new Book (meyer, "Eclipse", 629);

        List<Book> books = new ArrayList<>();
        books.add(philosophersStone);
        books.add(chamberOfSecrets);
        books.add(prisonerOfAzkaban);
        books.add(fellowshipOfTheRing);
        books.add(twoTowers);
        books.add(returnOfTheKing);
        books.add(twilight);
        books.add(newMoon);
        books.add(eclipse);
        return books;
    }
}
