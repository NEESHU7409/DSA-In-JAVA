/*There would be Multiple Approaches to solve this problem. The first approach can be traverse the array from len-1 to 0. and during traverse copy into auxilary array and then copy the orginial array into auxilary array. But this approach Space Complexity will be O(N) and 2 Time Traversal Also required.

The Better Approach would be 2 pointor approach. In this Approach we place the first pointor on 0th index and the second pointor on len-1. And then we keep swapping the value of first with the second and incrementing the first and decrementing the second and we keep doing it till first and second cross each other.*/

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
