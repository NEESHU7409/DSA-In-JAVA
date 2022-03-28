/*
 * Problem Statement
 * Ninja has been given two sorted integer arrays/lists ‘ARR1’ and ‘ARR2’ of
 * size ‘M’ and ‘N’. Ninja has to merge these sorted arrays/lists into ‘ARR1’ as
 * one sorted array. You may have to assume that ‘ARR1’ has a size equal to ‘M’
 * + ‘N’ such that ‘ARR1’ has enough space to add all the elements of ‘ARR2’ in
 * ‘ARR1’.
 * For example:
 * ‘ARR1’ = [3 6 9 0 0]
 * ‘ARR2’ = [4 10]
 * After merging the ‘ARR1’ and ‘ARR2’ in ‘ARR1’.
 * ‘ARR1’ = [3 4 6 9 10]
 * Input Format
 * The first line of input contains an integer ‘T’ which denotes the number of
 * test cases or queries to be run. Then the test cases follow.
 * 
 * The first line of each test case contains two space-separated integers ‘M’
 * and ‘N’, which represent the size of ‘ARR1’ and ‘ARR2’.
 * 
 * The next lines of each test case contain ‘M’ space-separated integers and ‘N’
 * zeros (i.e. 0) which represent the number of elements in ‘ARR1’.
 * 
 * The next lines of each test case contain ‘N’ space-separated integers which
 * represent the number of elements in ‘ARR2’.
 * Output Format :
 * For each test case, return the ‘ARR1’ after merging.
 * 
 * Print the output of each test case in a separate line.
 * Note:
 * You do not need to print anything; it has already been taken care of. Just
 * implement the given function.
 * Constraints:
 * 1 <= ‘T’ <= 100
 * 1 <= ‘M’, ‘N’ <= 5000
 * 1 <= ‘ARR1[i], ARR2[i]’ <= 100000
 * 
 * Time Limit: 1 second
 * Sample Input 1:
 * 2
 * 3 2
 * 1 2 3 0 0
 * 4 5
 * 4 2
 * 1 4 6 10 0 0
 * 2 5
 * Sample Output 1:
 * 1 2 3 4 5
 * 1 2 4 5 6 10
 * Explanation for Sample Output 1:
 * For sample test case 1:
 * In this test case, After merging ‘ARR2’ into ‘ARR1’.
 * ‘ARR1’ = [1 2 3 4 5]
 * 
 * For sample test case 2:
 * In this test case, After merging ‘ARR2’ into ‘ARR1’.
 * ‘ARR1’ = [1 2 4 5 6 10]
 * Sample Input 2:
 * 2
 * 2 3
 * 1 10 0 0 0
 * 3 8 11
 * 3 3
 * 3 4 6 0 0 0
 * 1 8 10
 * Sample Output 2:
 * 1 3 8 10 11
 * 1 3 4 6 8 10
 * Explanation for Sample Output 2:
 * For sample test case 1:
 * In this test case, After merging ‘ARR2’ into ‘ARR1’.
 * ‘ARR1’ = [1 3 8 10 11]
 * 
 * For sample test case 2:
 * In this test case, After merging ‘ARR2’ into ‘ARR1’.
 * ‘ARR1’ = [1 3 4 6 8 10]
 */

/*
 * Brute Force
 * Our main task is that after merging ‘ARR2’ into ‘ARR1’. The resultant ‘ARR1’
 * is also sorted. So first we simply add all the elements of ‘ARR2’ into
 * ‘ARR1’. Then we can apply any sorting algorithm to sort ‘ARR1’.
 * 
 * 
 * 
 * Algorithm:
 * 
 * We run a loop for ‘i’ = 0 to ‘N’:
 * ‘ARR1[M + i]’ = ‘ARR2[i]’
 * Sort the array/list ‘ARR1’.
 * Finally, return ‘ARR1’.
 * Time Complexity
 * O((M+N) * log(M+N)) Where ‘M’ and ‘N’ are the number of elements in ‘ARR1’
 * and ‘ARR2’ respectively.
 * 
 * 
 * 
 * First, we are traversing on ‘ARR2’ it takes O(N) time. Then we are sorting
 * the ‘ARR1’. So the overall complexity is O((M+N) * log(M+N)).
 * 
 * Space Complexity
 * O(1) .
 * 
 * 
 * 
 * Because we are not using any extra space for finding our resultant answer.
 */
/*
 * Time complexity: O((M+N) * log(M+N))
 * Space complexity: O(1)
 * 
 * Where M and N are the number of elements in ARR1 and ARR2 respectively.
 */

// import java.util.Arrays;

/*
 * class Solution1 {
 * public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int
 * n) {
 * 
 * for (int i = 0; i < n; i++) {
 * arr1[i + m] = arr2[i];
 * }
 * 
 * Arrays.sort(arr1);
 * return arr1;
 * 
 * }
 * }
 * 
 * 
 * public class MergeTwoSortedArray {
 * 
 * }
 */

/*
 * Greedy Approach
 * As we know both ‘ARR1’ and ‘ARR2’ are sorted. So we can declare two variables
 * ‘i’ and ‘j’ and initialize ‘i’ with ‘M’ and ‘j’ with ‘N’. Then we compare the
 * last element of both arrays/lists and we insert the larger element to the end
 * of the ‘ARR1’. We continue this process while all the elements of ‘ARR2’ are
 * not merged into ‘ARR1’.
 * 
 * 
 * 
 * Algorithm:
 * 
 * We declare two variables ‘i’ and ‘j’ and initialize ‘i’ with ‘M’ and ‘j’ with
 * ‘N’.
 * We declare a variable ‘LAST_INDEX’ and initialize it with ‘M+N’.
 * We run a loop while ‘j’ >= 0:
 * If ‘i’ >= 0 and ‘ARR1[i]’ > ‘ARR2[j]’:
 * ‘ARR1[LAST_INDEX] = ‘ARR1[i]’
 * ‘i’--
 * Else:
 * ‘ARR1[LAST_INDEX] = ‘ARR2[j]’
 * ‘j’--
 * ‘LAST_INDEX’--
 * Finally, Return ‘ARR1’.
 * Time Complexity
 * O(M + N) Where ‘M’ and ‘N’ are the number of elements in ‘ARR1’ and ‘ARR2’
 * respectively.
 * 
 * 
 * 
 * Because we are traversing once on ‘ARR1’ and ‘ARR2’. So the overall
 * complexity is O(M + N).
 * 
 * Space Complexity
 * O(1),
 * 
 * 
 * 
 * Because we are not using any extra space for finding our resultant answer.
 * 
 */
/*
 * Time complexity: O(M+N)
 * Space complexity: O(1)
 * 
 * Where M and N are the number of elements in ARR1 and ARR2 respectively.
 */
/*
 * public class Solution {
 * public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int
 * n) {
 * 
 * int i = m - 1;
 * int j = n - 1;
 * int lastIndex = m + n - 1;
 * 
 * while (j >= 0) {
 * 
 * if (i >= 0 && arr1[i] > arr2[j]) {
 * arr1[lastIndex] = arr1[i];
 * i--;
 * } else {
 * 
 * arr1[lastIndex] = arr2[j];
 * j--;
 * }
 * 
 * lastIndex--;
 * }
 * return arr1;
 * 
 * }
 * }
 */