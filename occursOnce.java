/*
 * You are given an array A of length N, where N is always an odd integer. There
 * are (N-1)/2 elements in the array that occur twice and one element which
 * occurs once. Your task is to find the only element that occurs once in the
 * array.
 * Note: There are (N-1)/2+1 elements that are unique in the array.
 * Input Format:
 * The first line of the input contains ‘T’ denoting the number of test cases.
 * 
 * The first line of each test case contains an integer ‘N’, representing the
 * length of the array.
 * 
 * The second line of each test case contains N space-separated integers of the
 * array A.
 * Output Format:
 * For each test case, print the only integer which occurs once in the array.
 * The output of each test case is printed on a new line.
 * Note:
 * You do not need to print anything, it has already been taken care of. Just
 * implement the given function.
 * Constraints:
 * 1 <= T <= 50
 * 1 <= N <= 10^4
 * -10^6 <= A[i] <=10^6
 * 
 * Where T denotes the number of test cases and N denotes the length of array
 * A[].
 * 
 * Time Limit: 1 sec
 * Sample Input 1:
 * 2
 * 7
 * 7 3 5 4 5 3 4
 * 9
 * 5 6 9 6 1 9 1 5 3
 * Sample Output 1:
 * 7
 * 3
 * Explanation For Sample Input 1:
 * In the first test case the integers 3, 4, 5 occur twice and only the integer
 * 7 occurs once.
 * 
 * In the second test case the integers 1, 5, 6, 9 occur twice and only the
 * integer 3 occurs once.
 * Sample Input 2:
 * 3
 * 1
 * 5
 * 3
 * 6 9 6
 * 5
 * 6 9 3 6 3
 * Sample Output 2:
 * 5
 * 9
 * 9
 * 
 */
/*
 * public class Solution {
 * public static int occursOnce(int[] a, int n) {
 * int result=a[0];
 * for(int i=1;i<n;i++){
 * result=a[i]^result;
 * }
 * return result;
 * }
 * }
 */
