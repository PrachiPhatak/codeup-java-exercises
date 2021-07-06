package food;

abstract class Fruit {
    public String color;
    public String flavor;
    public boolean isAvailable;
    public String name = "fruit";

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(String color, String flavor, boolean isAvailable, String name) {
        this.color = color;
        this.flavor = flavor;
        this.isAvailable = isAvailable;
        this.name = name;
    }

    public String describe() {
        return "I am " + name + ".";
    }
}
