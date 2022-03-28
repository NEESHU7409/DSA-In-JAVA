/*
Problem-1 Start with Finding the Largest Element in Array Problem

Example: Given is an array {100,20,900,1000,555,22}, The Largest Element is 1000

*/

// FIRST APPROACH

public class LargestElementInArray {
    int arr[];

    LargestElementInArray() {
        arr = new int[] { 100, 20, 900, 1000, 555, 22 };
    }

    /*
     * In this Approach Compare all the Elements One By One with all
     * Elements if any next element comes greater than exit and
     * choose the next element and compare the same with all and
     * repeat the process
     */
    void approach1() {
        boolean isMax;
        for (int i = 0; i < arr.length; i++) {
            isMax = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isMax = false;
                    break; // exit from the current loop
                } // if ends
            } // inner loop ends
            if (isMax) {
                System.out.println("Largest Element is " + arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        new LargestElementInArray().approach1();
    }
}

// Another Approach can be Sort in Array in Descending Order and get the 0th
// index element.
/*
 * Arrays.sort(arr, Collections.reverseOrder());
 * System.out.println(arr[0]);
 * 
 * void approach2(){
 * int max = arr[0];
 * for(int i = 1; i<arr.length; i++){
 * if(arr[i]>max){
 * max = arr[i];
 * }
 * }
 * System.out.println("Max is "+max);
 * }
 */