package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Reactangle rect = new Reactangle(4, 5);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Reactangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
    }
}
