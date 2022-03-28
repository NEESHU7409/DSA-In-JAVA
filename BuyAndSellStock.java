/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/

/* solution using two pointer technic
 step 1: intialize minSoFar var by a[0] and maxProfit by 0
 step 2: now ron a loop i<n
 step 3: if(minSoFar>a[i]) then minSoFar=a[i]
 step 4: if(maxProfit<a[i]-minSoFar) then maxProfit=a[i]-minSoFar
 step 5: return maxProfit
 */

class BuyAndSellStock {
    public int maxProfit(int[] a) {
        int minSoFar = a[0];
        int maxProfit = 0;
        for (int i = 0; i < a.length; i++) {
            if (minSoFar > a[i]) {
                minSoFar = a[i];
            }
            if (maxProfit < a[i] - minSoFar) {
                maxProfit = a[i] - minSoFar;
            }
        }
        return maxProfit;

    }
}

/*
 * using postfix array
 * 
 * step 1:make a aux array of postfix
 * step 2: intialize a array maxProfit by 0
 * step 3:now run a loop i=0 to n-1
 * step 4:if(maxProfit<aux[i]-a[i]) then maxProfit=aux[i]-a[i];
 * step 5:return maxprofit
 */

class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int aux[] = new int[n];
        int max = a[n - 1];
        int maxProfit = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (max <= a[i]) {
                max = a[i];
            }
            aux[i] = max;
        }
        for (int i = 0; i < n; i++) {
            if (maxProfit < (aux[i] - a[i])) {
                maxProfit = aux[i] - a[i];
            }
        }
        return maxProfit;
    }
}