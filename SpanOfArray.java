/*Here in this Question you need to find the diff b/w min and max element of an array. this is called as span of an array

Approach is find the Max Element and Min Element of an Array and then print the diff b/w the max and min.*/
public class SpanOfArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 11, 90, 9 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }
        }
        System.out.println("Span " + (max - min));

    }
}
