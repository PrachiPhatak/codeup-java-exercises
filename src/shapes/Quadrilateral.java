package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected float length;
    protected float width;

    public Quadrilateral(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public abstract void setLength(float length);

    public abstract void setWidth(float width);

    @Override
    public float getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public float getArea() {
        return length * width;
    }
}
