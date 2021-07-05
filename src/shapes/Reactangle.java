package shapes;

public class Reactangle extends Quadrilateral{

    public Reactangle(float length, float width) {
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
