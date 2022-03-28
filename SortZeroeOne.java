import java.util.Scanner;
public class SortZeroeOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        sort(a,n);
        print(a,n);

    }
    static void sort(int a[],int n){
    int low=0;
    int high=n-1;
    while(low<high){
        if(a[low]==0){
            low++;
        }
        if(a[low]==1){
            swap(a,low,high);
            high--;
        }
    }

    }
    static void swap(int a[],int low,int high){
        int temp=a[low];
        a[low]=a[high];
        a[high]=temp;
    }
    static void print(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i] +" ");
        }
    }
}
