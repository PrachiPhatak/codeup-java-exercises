package collection;

public class Employee {
    String firstName;
    String lastName;

    public Employee(String p){
        this.firstName = "firstName";
        this.lastName = "lastName";
    }

    public Employee(String firstName, String lastName) {
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

    public void printFullName(){
        System.out.println(firstName + " "+lastName);
    }
}
