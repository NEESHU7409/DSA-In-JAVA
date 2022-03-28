/*
 * Hashing Solution
 * We can store the frequency of every element in the array in a hashmap.
 * We will loop over every index i, and check the frequency of (Target - ARR[i])
 * is the hashmap:
 * If (Target - ARR[i]) is equal to ARR[i], we will check if frequency of ARR[i]
 * . If it is greater than 1 then we will decrease the frequency of ARR[i] by 2
 * and add a pair (ARR[i] , ARR[i]) to our answer.
 * Else, if the frequency of ARR[i] and Target - ARR[i] is greater than equal to
 * 1 then we add pair (ARR[i], Target - ARR[i]) to our answer and decrease the
 * frequency of both by 1.
 * If no valid pairs exist, we will return [[-1,-1]].
 * Time Complexity
 * O(N), where ‘N’ is the total number of elements in an array.
 * 
 * 
 * 
 * As every element is visited at most two times and hashmap operations take
 * constant time, the time complexity will be O(N).
 * 
 * Space Complexity
 * O(N), where ‘N’ is the total number of elements in an array.
 * 
 * 
 * 
 * As every element is stored in a hashmap, so it will take O(N) space.
 */

/*
 * Brute force solution
 * Using Nested Loop We can Find The solution
 */

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * 
 * Where 'N' is the total number of elements in the array.
 */
/*
 * import java.util.ArrayList;
 * import java.util.HashMap;
 * 
 * public class TwoSum {
 * public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer>
 * arr, int target, int n) {
 * 
 * // Declaring a hashmap.
 * HashMap<Integer, Integer> map = new HashMap<>();
 * 
 * for (int i = 0; i < n; i++) {
 * if (map.containsKey(arr.get(i))) {
 * map.put(arr.get(i), map.get(arr.get(i)) + 1);
 * } else {
 * map.put(arr.get(i), 1);
 * }
 * 
 * }
 * ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();
 * 
 * // Looping over all elements in the array.
 * for (int i = 0; i < n; i++) {
 * if (target - arr.get(i) == arr.get(i)) {
 * if (map.get(arr.get(i)) > 1) {
 * ans.add(new Pair(arr.get(i), arr.get(i)));
 * map.put(arr.get(i), map.get(arr.get(i)) - 2);
 * }
 * } else {
 * if (map.containsKey(target - arr.get(i)) && map.get(arr.get(i)) > 0
 * && map.get(target - arr.get(i)) > 0) {
 * 
 * ans.add(new Pair(arr.get(i), target - arr.get(i)));
 * map.put(arr.get(i), map.get(arr.get(i)) - 1);
 * map.put(target - arr.get(i), map.get(target - arr.get(i)) - 1);
 * }
 * }
 * }
 * 
 * if (ans.size() == 0)
 * ans.add(new Pair(-1, -1));
 * 
 * return ans;
 * }
 * }
 */