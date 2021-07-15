import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String in = input.getString();
        System.out.println(input.getInteger(in));;
//        System.out.println(input.getDouble(in));;
    }
}
