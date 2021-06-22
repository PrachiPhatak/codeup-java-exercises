public class HelloWorld {

    public static void main(String[] args) {

        int myFavoriteNumber = 6;
        System.out.println(myFavoriteNumber);

        String myString = "Kids";
        System.out.println(myString);

        // myString = 'c' gives error
        // myString = 3.14 gives error

        float myNumber = 3.14f;
        // Gives error as it's not initialized
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 10;
        System.out.println(++y);
        System.out.println(y);

        int x1 = 10;
        int y1 = 2;
        x1 = x1 / y1;
        y1 = y1 - x1;
        System.out.println(x1);
        System.out.println(y1);

        var c = 10L;
        System.out.println(((Object)c).getClass());


    }
}