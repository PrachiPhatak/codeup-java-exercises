package shapes;

public class ShapeTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(5);
        System.out.println("Area " + myShape.getArea());
        System.out.println("Perimeter " + myShape.getPerimeter());

        Measurable box1 = new Reactangle(5,4);
        System.out.println("Area "+ box1.getArea());
        System.out.println("Area "+ box1.getPerimeter());

        //Reactangle rect = new Quadrilateral();
    }
}
