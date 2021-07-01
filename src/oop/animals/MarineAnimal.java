package oop.animals;

public class MarineAnimal {
    private boolean canSwim;
    private int length;
    private int finCount;
    private boolean isSaltwater;
    private String name;

    public MarineAnimal(boolean canSwim, int length, int finCount, boolean isSaltwater, String name) {
        this.canSwim = canSwim;
        this.length = length;
        this.finCount = finCount;
        this.isSaltwater = isSaltwater;
        this.name = name;
    }

    public MarineAnimal(String name) {
        this.name = name;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        this.finCount = finCount;
    }

    public boolean isSaltwater() {
        return isSaltwater;
    }

    public void setSaltwater(boolean saltwater) {
        isSaltwater = saltwater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
