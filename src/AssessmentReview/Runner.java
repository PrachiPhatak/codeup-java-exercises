package AssessmentReview;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,3};
        System.out.println(Arrays.toString(Questions.ascending(arr)));

        System.out.println(Questions.countWords("Prachi Phatak ndsfjkd sdfsdf sfd"));

        System.out.println(Questions.calculator("+", 20, 30));
        System.out.println(Questions.calculator("-", 20, 30));
        System.out.println(Questions.calculator("*", 20, 30));
        System.out.println(Questions.calculator("/", 20, 30));

        System.out.println(Questions.cardHidden("123456789444"));

        Questions.reverseOddStrings("Prachi Phatak nds sdfsdff sffd");
    }
}
