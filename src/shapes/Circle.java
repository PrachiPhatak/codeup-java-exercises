package shapes;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (22/7) * radius * radius;
    }

    public double getCircumference() {
        return 2 * (22/7) * radius;
    }
}
