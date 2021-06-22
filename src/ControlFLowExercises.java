public class ControlFLowExercises {
    public static void main(String[] args) {
        for (long x = 2; x <= 1000000; x = x * x) {
            System.out.println(x);
        }

        long i = 2;
        do {
            System.out.println(i);
            i = i * i;
        } while (i <= 1000000);
    }
}
