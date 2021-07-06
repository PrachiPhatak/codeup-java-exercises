package warmup;

import javax.sound.midi.Soundbank;

public class Child extends Parent{
    public void parentSays(){
        System.out.print("Child is saying... ");
        super.says();
    }
    public void says(){
        System.out.println("I am Child");
    }
}
