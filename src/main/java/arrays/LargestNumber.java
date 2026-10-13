package arrays;

public class LargestNumber {
    public static void main(String[] args){
        int[] arr={10,20,34,39,40};
        int largest =arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
