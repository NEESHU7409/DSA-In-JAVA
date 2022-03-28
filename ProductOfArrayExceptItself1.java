import java.util.Scanner;
 class ProductOfArrayExceptItself1 {
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
        int prod=1;
        int temp=1;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp*=nums[i];
            a[i]=temp;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==0){
                a[i]=prod;
            }
            else{
            a[i]=a[i-1]*prod;
            prod*=nums[i];
        }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i] +" ");
        }
        
    }
    }
    

