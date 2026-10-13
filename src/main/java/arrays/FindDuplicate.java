package arrays;

public class FindDuplicate {
    public static void main(String[] args){
        int[] arr={10,32,12,32,45,34};
        for (int i =1;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }


        }
    }
}
