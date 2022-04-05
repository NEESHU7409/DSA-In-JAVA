/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2

Solution: BruteForce
Algorithm

The simplest method is to consider every possible subarray of the given numsnums array,
 find the sum of the elements of each of those subarrays and check for the equality of the sum obtained with the given kk.
 Whenever the sum equals kk, we can increment the countcount used to store the required result.

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += nums[i];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}

Time complexity : O(n^3)O(n 
3
 ). Considering every possible subarray takes O(n^2)O(n 
2
 ) time. For each of the subarray we calculate the sum taking O(n)O(n) time in the worst case, taking a total of O(n^3)O(n 
3
 ) time.

Space complexity : O(1)O(1). Constant space is used.

Approach 2: Using Cumulative Sum
Algorithm

Instead of determining the sum of elements every time for every new subarray considered, we can make use of a cumulative sum array , sumsum. Then, in order to calculate the sum of elements lying between two indices, we can subtract the cumulative sum corresponding to the two indices to obtain the sum directly, instead of iterating over the subarray to obtain the sum.

In this implementation, we make use of a cumulative sum array, sumsum, such that sum[i]sum[i] is used to store the cumulative sum of numsnums array up to the element corresponding to the (i-1)^{th}(i−1) 
th
  index. Thus, to determine the sum of elements for the subarray nums[i:j]nums[i:j], we can directly use sum[j+1] - sum[i]sum[j+1]−sum[i].



  public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sum[i] = sum[i - 1] + nums[i - 1];
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                if (sum[end] - sum[start] == k)
                    count++;
            }
        }
        return count;
    }
}


Complexity Analysis

Time complexity : O(n^2)O(n 
2
 ). Considering every possible subarray takes O(n^2)O(n 
2
 ) time. Finding out the sum of any subarray takes O(1)O(1) time after the initial processing of O(n)O(n) for creating the cumulative sum array.

Space complexity : O(n)O(
    Approach 3: Without Space
Algorithm

Instead of considering all the startstart and endend points and then finding the sum for each subarray corresponding to those points, we can directly find the sum on the go while considering different endend points. i.e. We can choose a particular startstart point and while iterating over the endend points, we can add the element corresponding to the endend point to the sum formed till now. Whenever the sumsum equals the required kk value, we can update the countcount value. We do so while iterating over all the endend indices possible for every startstart index. Whenever, we update the startstart index, we need to reset the sumsum value to 0.n). Cumulative sum array sumsum of size n+1n+1 is used.


*/

