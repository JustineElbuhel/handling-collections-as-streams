package IntermediateOperations;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String first, String last, int year){
        this.firstName = first;
        this.lastName = last;
        this.birthYear = year;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
