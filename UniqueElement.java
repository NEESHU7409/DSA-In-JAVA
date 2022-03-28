import java.util.Scanner;
public class UniqueElement {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        unique(a,n);
    }
    static void unique(int a[],int n){
        int res=0;
        for(int i=0;i<n;i++){
           int temp=(i+1)^a[i];
           res=res^temp;
        }
    }
}
