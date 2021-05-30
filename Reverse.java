package CodingPractice.ArrayQuestion;

public class Reverse {

    public static void main(String... strings){
        Reverse r = new Reverse();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int c[] = r.reverseArray(arr);

        for(int i =0 ; i <c.length ; i++){
            System.out.print(c[i] + " ");
        }
    }

    private int[] reverseArray(int[] arr) {
        for(int i =0 ; i< arr.length/2 ;i++){
            int c = arr[arr.length -(i+1)];
            arr[arr.length -(i+1)] = arr[i];
            arr[i] = c ;
        }
        return arr;
    }
}
