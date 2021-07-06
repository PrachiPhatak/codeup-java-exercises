package company;

public class Developer extends Employee {
    @Override
    String getRole() {
        return "Developer";
    }

    @Override
    public String doesWork() {
        return "build applications";
    }
}
