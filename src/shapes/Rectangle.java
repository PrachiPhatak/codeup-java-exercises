package shapes;

public class Rectangle extends Quadrilateral{

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

}
