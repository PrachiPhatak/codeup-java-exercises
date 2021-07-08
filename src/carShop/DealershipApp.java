package carShop;

public class DealershipApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Prachi", "Phatak");
        Car car = new Car("M5", "BMW", "White", 2020);

        System.out.println(customer.describe(String.format("%s, %s, %s, %s", car.getModel(), car.getMake(), car.getColor(), car.getYear())));
    }
}
