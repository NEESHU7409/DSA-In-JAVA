/*
 * 
 * Problem Statement
 * You are given an array ‘ARR’ of size ‘N’ containing each number between 1 and
 * ‘N’ - 1 at least once. There is a single integer value that is present in the
 * array twice. Your task is to find the duplicate integer value present in the
 * array.
 * For example:
 * Consider ARR = [1, 2, 3, 4, 4], the duplicate integer value present in the
 * array is 4. Hence, the answer is 4 in this case.
 * Note :
 * A duplicate number is always present in the given array.
 * Input Format:
 * The first line of the input contains an integer, 'T,’ denoting the number of
 * test cases.
 * The first line of each test case contains a single integer, 'N', denoting the
 * number of elements in the array.
 * The second line of each test case contains 'N' space-separated integers
 * denoting the elements of the array 'ARR'.
 * Output Format:
 * For each test case, print a single integer - the duplicate element in the
 * array.
 * 
 * Print the output of each test case in a separate line.
 * Constraints:
 * 1 <= T <= 10
 * 2 <= N <= 10 ^ 5
 * 1 <= ARR[i] <= N - 1
 * 
 * Where 'T' denotes the number of test cases, 'N' denotes the number of
 * elements in the array, and 'ARR[i]' denotes the 'i-th' element of the array
 * 'ARR'.
 * 
 * Time limit: 1 sec
 * Sample Input 1:
 * 2
 * 5
 * 4 2 1 3 1
 * 7
 * 6 3 1 5 4 3 2
 * Sample Output 1:
 * 1
 * 3
 * Explanation Of Sample Input 1:
 * For the first test case,
 * The duplicate integer value present in the array is 1. Hence, the answer is 1
 * in this case.
 * 
 * For the second test case,
 * The duplicate integer value present in the array is 3. Hence, the answer is 3
 * in this case.
 * Sample Input 2:
 * 2
 * 6
 * 5 1 2 3 4 2
 * 9
 * 8 7 2 5 4 7 1 3 6
 * Sample Output 2:
 * 2
 * 7
 */

/*
 * Brute Force
 * A simple method is to traverse through the array ARR to find the frequency of
 * each number in the given array, and we will check if the frequency of the
 * number is more than 1.
 * 
 * 
 * 
 * Therefore, our approach will be to iterate currentNumber from 1 to N - 1. In
 * each iteration, we will traverse through the array ARR to find the frequency
 * of currentNumber in the array. We will check if the frequency is more than 1,
 * then there is a duplicate of the number currentNumber in the array ARR. In
 * the end, we will return the duplicate integer value present in the array.
 * 
 * 
 * 
 * Algorithm:
 * 
 * 
 * We will initialize duplicate as 0. The variable duplicate stores the
 * duplicate element in the array.
 * Iterate currentNumber from 1 to N - 1.
 * We will set count as 0. The variable count stores the count of currentNumber
 * in the array ARR.
 * Iterate index from 0 to N - 1.
 * We will check if ARR[index] is equal to currentNumber,
 * We will Increment count by 1.
 * We will check if count is more than 1,
 * Update the value of duplicate with currentNumber.
 * Return the variable duplicate.
 * Time Complexity
 * O(N ^ 2), where N denotes the number of elements in the array.
 * 
 * 
 * 
 * We are doing N - 1 iteration, and in each iteration, we are traversing
 * through the array ARR to find the frequency of the number in the given array
 * that takes O(N) time. Hence, the overall Time Complexity = O(N) * (N) = O(N ^
 * 2).
 * 
 * Space Complexity
 * O(1).
 * 
 * 
 * 
 * Constant space is being used. Hence, the overall Space Complexity is O(1).
 * 
 * 
 * /*
 * Time Complexity O(N^2)
 * Space Complexity: O(1)
 * 
 * Where N is the number of elements in the array.
 */
/*
 * import java.util.ArrayList;
 * 
 * public class Solution {
 * 
 * public static int findDuplicate(ArrayList<Integer> arr) {
 * 
 * int n = arr.size();
 * 
 * // The variable duplicate stores the duplicate element in the array
 * int duplicate = 0;
 * 
 * for (int currentNumber = 1; currentNumber <= n - 1; currentNumber++) {
 * // The variable count stores the number of currentNumber in the array ARR
 * int count = 0;
 * 
 * // Traverse through the array ARR
 * for (int index = 0; index < n; index++) {
 * // Check if ARR[index] is equal to currentNumber
 * if (arr.get(index) == currentNumber) {
 * count++;
 * }
 * }
 * 
 * // Check if count is more than 1
 * if (count > 1) {
 * duplicate = currentNumber;
 * }
 * }
 * 
 * // Return the variable duplicate
 * return duplicate;
 * 
 * }
 * }
 * 
 * 
 * 
 * 
 */

/*
 * Dynamic Programming
 * The idea is to observe the fact that all array elements contain a value
 * between 1 to N - 1. Our approach will be to construct an array to store the
 * frequency of each element in the given array.
 * 
 * We will construct array frequency, which will store the frequency of each
 * element in the array.
 * 
 * We will iterate index from 0 to N - 1, and we will increment the count of
 * ARR[index] in the array frequency. So, we will increment
 * frequency[ARR[index]] by 1.
 * We will iterate currentNumber from 1 to N - 1, and we will check if
 * frequency[currentNumber] is more than 1, then there is a duplicate of the
 * number currentNumber in the array ARR.
 * In the end, we will return the duplicate integer value present in the array.
 * 
 * 
 * 
 * Algorithm:
 * 
 * 
 * 
 * We will initialize duplicate as 0. The variable duplicate stores the
 * duplicate element in the array.
 * Create an array frequency of size N, which will store the count of each
 * element present in the array ARR.
 * Iterate index from 0 to N - 1.
 * We will set the variable currentNumber as ARR[index].
 * Increment frequency[currentNumber] by 1.
 * Iterate currentNumber from 1 to N - 1.
 * We will check if frequency[currentNumber] is more than 1.
 * Update the value of duplicate with currentNumber.
 * Return the variable duplicate.
 * Time Complexity
 * O(N), where N denotes the number of elements in the array.
 * 
 * 
 * 
 * The Time Complexity to store the frequency of each element in the array ARR
 * is O(N). The Time Complexity to find the duplicate element in the array is
 * O(N). Hence the overall Time Complexity is O(N).
 * 
 * Space Complexity
 * O(N), where N denotes the number of elements in the array.
 * 
 * 
 * 
 * The Space Complexity O(N) is used to store the frequency of each element in
 * the array ARR. Hence, the overall Space Complexity is O(N).
 */
/*
 * 
 * 
 * import java.util.ArrayList;
 * 
 * public class Solution {
 * 
 * public static int findDuplicate(ArrayList<Integer> arr) {
 * 
 * int n = arr.size();
 * 
 * // The variable duplicate stores the duplicate element in the array
 * int duplicate = 1;
 * 
 * // Create an array frequency to store the count of each element present in
 * the array ARR
 * ArrayList<Integer> frequency = new ArrayList<Integer>(n);
 * 
 * for (int i = 0; i < n; i++) {
 * frequency.add( 0);
 * }
 * 
 * // Traverse through the array ARR
 * for (int index = 0; index < n; index++) {
 * 
 * int currentNumber = arr.get(index);
 * frequency.set(currentNumber, frequency.get(currentNumber) + 1);
 * 
 * }
 * 
 * // Iterate currentNumber from 1 to N - 1
 * for (int currentNumber = 1; currentNumber <= n - 1; currentNumber++) {
 * 
 * // Check if frequency[currentNumber] is more than 1
 * if ( frequency.get(currentNumber) > 1) {
 * duplicate = currentNumber;
 * }
 * }
 * 
 * // Return the variable duplicate
 * return duplicate;
 * 
 * }
 * }
 */

/*
 * Floyd’s cycle finding algorithm
 * The idea is to maintain two pointers, fast and slow. The pointer slow goes
 * forward one step, and the pointer fast goes forward two steps each time. The
 * two pointers meet in a cycle when the pointer fast becomes equal to the
 * pointer slow, and then the duplicate number must be the entry point of the
 * cycle.
 * 
 * 
 * Our approach will be to find the cycle. We will set slow as ARR[0] and fast
 * as ARR[ ARR[0] ]. We will iterate till fast is not equal to small. In each
 * iteration, we will move the pointer slow one step forward, and the pointer
 * fast two steps forward. So, we will update slow with ARR[slow] and fast with
 * ARR[ ARR[fast] ].
 * After we have found the cycle, we will find the entry pointer of the cycle.
 * We will set fast as 0. We will iterate till fast is not equal to small, and
 * in each iteration, we will update slow with ARR[slow] and fast with
 * ARR[fast].
 * In the end, the variable slow will contain the duplicate element present in
 * the array. So, we will return the variable slow.
 * 
 * 
 * 
 * Algorithm:
 * 
 * 
 * We will set slow as ARR[0] and fast as ARR[ ARR[0] ].The variable slow and
 * fast are the two-pointer that we are using to find the duplicate element in
 * the array.
 * Iterate till fast is not equal to slow.
 * Update slow with ARR[slow]. We are moving the pointer slow one step forward.
 * Update fast with ARR[ ARR[fast] ]. We are moving the pointer fast two steps
 * forward.
 * Assign fast as 0.
 * Iterate till fast is not equal to slow.
 * Update slow with ARR[slow].
 * Update fast with ARR[fast].
 * The variable slow will contain the duplicate element. So, we will return the
 * variable slow.
 * Time Complexity
 * O(N), where N denotes the number of elements in the array.
 * 
 * 
 * 
 * The Time Complexity to find the duplicate element in the array using Floyd’s
 * cycle finding algorithm is O(N). Hence the overall Time Complexity is O(N).
 * 
 * Space Complexity
 * O(1).
 * 
 * 
 * 
 * Constant space is being used. Hence, the overall Space Complexity is O(1).
 */

/*
 * 
 * 
 * import java.util.ArrayList;
 * 
 * public class Solution {
 * 
 * public static int findDuplicate(ArrayList<Integer> arr) {
 * 
 * // The variable slow and fast are the two pointers that we are using to find
 * the duplicate element
 * int slow = arr.get(0);
 * int fast = arr.get(arr.get(0));
 * 
 * // Iterate till fast is not equal to slow
 * while (fast != slow) {
 * 
 * // Update slow with ARR[slow]. We are moving the pointer slow one step
 * forward
 * slow = arr.get(slow);
 * 
 * // Update fast with ARR[ ARR[fast] ]. We are moving the pointer fast two
 * steps forward
 * fast = arr.get(arr.get(fast));
 * }
 * 
 * fast = 0;
 * 
 * // Loop to find the duplicate element in the array
 * while (slow != fast) {
 * slow = arr.get(slow);
 * fast = arr.get(fast);
 * }
 * 
 * // Return the variable slow
 * return slow;
 * 
 * }
 * }
 */

/*
 * XOR-based approach
 * The idea is to observe the fact that the XOR of two same numbers gives 0. The
 * given array contains values from 1 to N - 1 once and one duplicate value.
 * Using this idea, we can find the duplicate element val in the array ARR in
 * the following way given below:
 * 
 * 
 * 
 * duplicate= (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 3)....((N - 1) ^ (N - 1)) ^ val
 * 
 * 
 * The XOR value of each number with itself gives 0, and the remaining value
 * will be the duplicate value val that is present in the array ARR.
 * 
 * 
 * 
 * Our approach will be to initialize the variable duplicate, which will store
 * the duplicate integer value present in the array. We will set duplicate as 0.
 * 
 * We will iterate currentNumber from 1 to N - 1, and in each iteration, we will
 * update duplicate with XOR of duplicate and currentNumber.
 * We will iterate index from 0 to N-1, and we will update duplicate with XOR of
 * duplicate and ARR[index].
 * In the end, the variable duplicate will contain the duplicate integer value
 * present in the array ARR, and we will return the variable duplicate.
 * 
 * 
 * 
 * Algorithm:
 * 
 * 
 * 
 * We will initialize duplicate as 0. The variable duplicate stores the
 * duplicate element in the array.
 * Iterate currentNumber from 1 to N - 1.
 * Update duplicate with XOR of duplicate and currentNumber.
 * Iterate index from 0 to N - 1.
 * Update duplicate with XOR of duplicate and ARR[index].
 * Return the variable duplicate.
 * Time Complexity
 * O(N), where N denotes the number of elements in the array.
 * 
 * 
 * The Time Complexity to find the duplicate element in the array using the
 * XOR-based approach is O(N). Hence the overall Time Complexity is O(N).
 * 
 * Space Complexity
 * O(1).
 * 
 * 
 * Constant space is being used. Hence, the overall Space Complexity is O(1).
 * 
 * 
 * 
 * import java.util.ArrayList;
 * 
 * public class Solution {
 * 
 * public static int findDuplicate(ArrayList<Integer> arr) {
 * 
 * int n = arr.size();
 * 
 * // The variable duplicate stores the duplicate element in the array
 * int duplicate = 0;
 * 
 * // Iterate currentNumber from 1 to N - 1
 * for (int currentNumber = 1; currentNumber <= n - 1; currentNumber++) {
 * 
 * // Update duplicate with XOR of duplicate and currentNumber
 * duplicate = duplicate ^ currentNumber;
 * }
 * 
 * // Traverse through the array ARR
 * for (int index = 0; index < n; index++) {
 * 
 * // Update duplicate with XOR of duplicate and ARR[index]
 * duplicate = duplicate ^ arr.get(index);
 * }
 * 
 * // Return the variable duplicate
 * return duplicate;
 * 
 * }
 * }
 */
