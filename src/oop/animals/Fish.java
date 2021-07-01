package oop.animals;

public class Fish extends MarineAnimal{

    private boolean hasScale;

    public Fish(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, boolean hasScale) {
        super(canSwim, length, finCount, isSaltWater, name);
        this.hasScale = hasScale;
    }

    public Fish(String name){
        super(name);
    }

    public boolean isHasScale() {
        return hasScale;
    }

    public void setHasScale(boolean hasScale) {
        this.hasScale = hasScale;
    }

}
