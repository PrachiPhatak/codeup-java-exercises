import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] persons = new Person[3];
        persons[0] = new Person("Prachi", "Phatak");
        persons[1] = new Person("Casey", "Edwards");
        persons[2] = new Person("Laura", "Ruiz");

        for (Person person : persons) {
            person.print();
        }

        Person[] newPersons = Person.addPerson(persons, new Person("Dorian", "Wallace"));

        for (Person person : newPersons) {
            person.print();
        }
    }
}

