
/*Given is the Array as Input int arr[] = {10,20,3,20,19,15}; Output is 19 (It is the Second Largest Element in the Array)

Approach is First Find the First Largest Element in an Array and then check for the Second Largest.
*/
public class SecondLargestElement {

    static void approach() {
        int arr[] = { 10, 20, 3, 20, 19, 15 };
        // first find the first max element
        int max = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            // now check for the second max element
            if (arr[i] != max) { // checking the current element not same as first max element
                if (arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second Largest is " + secondMax);

    }

    public static void main(String[] args) {
        approach();

    }
}
