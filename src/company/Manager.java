package company;

public class Manager extends Employee{
    @Override
    String getRole() {
        return "Manager";
    }

    public String doesWork() {
        return "conduct meeting";
    }
}
