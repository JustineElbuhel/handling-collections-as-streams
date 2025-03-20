package UniqueLastNames;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String first, String last, int year){
        this.firstName = first;
        this.lastName = last;
        this.birthYear = year;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
