/*https://leetcode.com/problems/remove-duplicates-from-sorted-array/.
 The Solution comes in the mind is Store the Array element in HashSet , so it remove the duplicate element and store it in the list. HashSet is a predefine Java Data Structure , 
it stores only unique element and it is
 coming from java.util package. The TC is O(N) and SC is O(N).

The Optimal Solution is compare the previous value 0th index (j pointer) value with the next value (1st index ) 
(i pointer) , if not equal so increase the j pointer and then the current will consume the next element then increase the ith (next) pointer. Doing it in a loop till reach to the last element. 
At the end of the loop return the j+1 index. TC is O(N) and SC O(1).*/

public class RemoveDuplicateElementFomAnArray {

    static int removeDuplicates(int[] num) {
        int j = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[j] != num[i]) {
                j++;
                num[j] = num[i];

            }

        }
        return j + 1;
    }

    public static void main(String[] args) {

        int a[] = { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5 };
        int c = removeDuplicates(a);
        for (int i = 0; i < c; i++) {
            System.out.println("Unique are " + a[i]);
        }

    }
}
