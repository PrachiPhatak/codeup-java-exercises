import java.util.Arrays;

class Person implements Printable {
    String firstName;
    String lastName;

    /**
     * @param firstName - Person's first name
     * @param lastName  - Person's last name
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void print() {
        System.out.println("Person's first name is " + firstName
                + ". Person's last name is " + lastName + ".");
    }

    public static Person[] addPerson(Person[] personArray, Person person) {
        Person[] personArr = Arrays.copyOf(personArray, personArray.length + 1);
        personArr[personArr.length - 1] = person;
        return personArr;
    }

}
