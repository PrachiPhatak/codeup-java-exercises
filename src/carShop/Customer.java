package carShop;

public class Customer implements Describable {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
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
    public String describe(String details) {
        //return "Hey there firstName lastName, it looks like your  is ready to go!`\n";
        return "Hey there "+ firstName +" " + lastName+ ", it looks like your "+ details + " is ready to go!\n";
    }
}
