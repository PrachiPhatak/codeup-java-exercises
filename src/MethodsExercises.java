public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(5, 10));
//        System.out.println(multiplication(5, 10));
//        System.out.println(division(5, 10));
//        //if divided by zero, it throws Exception
//        System.out.println(modulus(5, 10));
        multiplicationTableWithRec(12, 1);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return b - a;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void multiplicationTable(int a) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = total + a;
            System.out.println(total);
        }
    }

    public static void multiplicationTableWithRec(int number, int i) {

    }
}
