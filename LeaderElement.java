/*
 * Write a program to print all the LEADERS in the array. An element is leader
 * if it is greater than all the elements to its right side. And the rightmost
 * element is always a leader. For example int the array
 * {300,40,60,90,100,12,16, 17, 4, 3, 5, 2}, leaders are 300,100,17, 5 and 2.
 * 
 * Approach is , Start from the last of array element , and compare last element
 * with the max variable , if the last one is greater than max , so max contains
 * the last element value and then decrease the index and move to the second
 * last element and so on
 * Code:
 * 
 * 
 * int arr [] = {16, 17, 4, 3, 5, 2};
 * int max = 0 ;
 * for(int i = arr.length-1 ; i>=0; i--) {
 * if(arr[i]>max) {
 * System.out.println("Leader "+arr[i]);
 * max = arr[i];
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 */
