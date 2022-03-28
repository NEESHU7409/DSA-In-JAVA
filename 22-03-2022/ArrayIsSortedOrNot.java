public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 1 };
        // Logic is if the next element is Smaller than the Previous so it is not sorted
        // in case of ascending order
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not Sorted ");
                return;
            }

        }
        System.out.println("Sorted...");

    }
}
