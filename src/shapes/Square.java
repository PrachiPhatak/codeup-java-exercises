package shapes;

public class Square extends Quadrilateral {

    public Square(float side) {
        super(side, side);
    }

    @Override
    public void setLength(float side) {
        this.length = side;
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

}
