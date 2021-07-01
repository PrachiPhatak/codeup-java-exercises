package oop;

public class Person {

    //Fields
    private String name;
    private int age;
    private String height;
    private String nationality;

    //Constructor
    public Person(){

    }
    public Person(String name, int age, String height, String nationality){
        this.name =name;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
