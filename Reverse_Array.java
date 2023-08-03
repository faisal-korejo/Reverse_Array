import java.util.Arrays;

public class Reverse_Array {
    public static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;

        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }




    public static void main(String[] args) {
        Reverse_Array obj=new Reverse_Array();

        int[] arr={1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
