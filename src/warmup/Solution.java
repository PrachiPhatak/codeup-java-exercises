package warmup;

public class Solution {
    public static void main(String[] args) {
        Parent mom = new Parent();
        Child daughter = new Child();
        Child son = new Child();

        mom.says();
        daughter.says();
        son.parentSays();
    }

}
