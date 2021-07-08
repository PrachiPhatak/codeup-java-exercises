public class Review {
    public static void main(String[] args) {
        System.out.println(total(25, 10));
        int[] arr = {2,3,4,5,6,8,10};
        even(arr);
    }

    public static double total(double bill, double tipPercentage){
        return  bill + ((tipPercentage / 100) * bill);
    }

    public static void even(int[] arr){
        for(int i=0; i< arr.length; i++){
            if(arr[i]%2 ==0){
                System.out.println("Even number: "+ arr[i]);
            }
        }
    }

}
