package arrays;

public class SmallestNumber {
    public static void main(String[] args) {

        int[] arr = {10, 45, 23, 5, 67, 12};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
    }
}
