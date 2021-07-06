package warmup;

public class Solution {
    public static void main(String[] args) {
        Parent mom = new Parent();
        Child daughter = new Child();
        Parent dad = new Child();

        dad.says();
        mom.says();
        daughter.says();
    }

}
