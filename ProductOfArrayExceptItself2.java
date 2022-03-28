/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Approach: PostFix And Prefix 
*/




import java.util.Scanner;
public class ProductOfArrayExceptItself2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        product(a,n);
    }
     static void product(int nums[],int n){
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int temp=1;
        for(int i=0;i<nums.length;i++){
            temp*=nums[i];
            left[i]=temp;
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
           temp*=nums[i];
            right[i]=temp;
        }
        for(int i=0;i<nums.length-1;i++){
            if(i==0){
                nums[i]=right[i+1];
            }
            else{
                nums[i]=left[i-1]*right[i+1];
            }
        }
        nums[nums.length-1]=left[nums.length-2];
        for (int i=0;i<n;i++){
            System.out.print(nums[i] +" ");
        }
    }
    
}
