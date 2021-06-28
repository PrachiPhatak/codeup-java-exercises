public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 10));
        System.out.println(substraction(5, 10));
        System.out.println(multiplication(5, 10));
        System.out.println(division(5, 10));
        //if divided by zero, it throws Exception
        System.out.println(modulus(5, 10));
        multiplication2(10);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int substraction(int a, int b) {
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

    public static void multiplication2(int a) {
        //TODO
//        int counter = 1;
//        do{
//
//        }while(false);
//        System.out.println(counter * a);
//
//        if(counter >= 10){
//            return;
//        }
//        counter++;
//        multiplication2(a);
    }

}
