package IntermediateOperations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Person a = new Person("a", "a", 1961);
        Person a2 = new Person("a", "b", 2002);
        Person c = new Person("c", "c", 2005);
        Person b = new Person("b", "b", 1998);

        ArrayList<Person> people = new ArrayList<>();
        people.add(a);
        people.add(b);
        people.add(c);

        long count = people.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println(count);

        long aStarter = people.stream()
                .filter(person -> person.getFirstName().startsWith("a"))
                .count();
        System.out.println(aStarter);

        people.stream()
                .map(person -> person.getFirstName())
                .distinct() //Returns a stream that only contains unique values
                .sorted() //Sorts the strings
                .forEach(name -> System.out.println(name));
    }
}
