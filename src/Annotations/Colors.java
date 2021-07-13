package Annotations;

class Red {
    public void show() {
        System.out.println("I am Red");
    }
}
class Orange extends Red{
    @Override
    public void show(){
        System.out.println("I am Orange");
    }

}
public class Colors {
    public static void main(String[] args) {
        Red redObj = new Red();
        redObj.show();

        Orange orangeObj = new Orange();
        orangeObj.show();

        Red redOrange = new Orange();
        redOrange.show();
    }
}
