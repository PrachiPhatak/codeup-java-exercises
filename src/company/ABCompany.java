package company;

public class ABCompany {
    public static void main(String[] args) {
        Employee employee101 = new Manager();
        Employee employee102 = new Developer();

        System.out.printf("Employee101 is %s. They %s. \n", employee101.getRole(), employee101.doesWork());
        System.out.printf("Employee102 is %s. They %s. \n", employee102.getRole(), employee102.doesWork());

        //Promotion
        employee102 = new Manager();
        System.out.printf("Employee102 is %s. They %s. \n", employee102.getRole(), employee102.doesWork());
    }
}

