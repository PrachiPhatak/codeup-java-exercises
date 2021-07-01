public class miniJune29 {
    public static void main(String[] args) {
        Person person = new Person("Sam");
        person.printName();
        System.out.println(person.getName());
    }
}

class Person {
    private String name;

    // the Person constructor
    public Person() {
        System.out.println("A Person is being created!");
    }

    public String getName(){
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Corey");
    }


}