public class miniJune29 {
    public static void main(String[] args) {
        Person1 person = new Person1("Sam");
        person.printName();
        System.out.println(person.getName());
    }
}

class Person1 {
    private String name;

    // the Person constructor
    public Person1() {
        System.out.println("A Person is being created!");
    }

    public Person1(String prachi, String phatak) {
    }

    public String getName(){
        return name;
    }

    public Person1(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1("Corey");
    }


}