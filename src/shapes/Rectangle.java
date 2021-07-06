package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(float length, float width) {
        super(length, width);
    }

    @Override
    public void setLength(float length) {
        super.length = length;
    }

    @Override
    public void setWidth(float width) {
        super.width = width;
    }

    @Override
    public float getPerimeter() {
        return super.getPerimeter();
    }
}