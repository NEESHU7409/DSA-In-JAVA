package Matrix2D;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class LuckyNumberInMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        List<Integer> minList=new LinkedList<Integer>();
        List<Integer> maxList=new LinkedList<Integer>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       int min=Integer.MIN_VALUE;
       int max=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              minList.add(Math.min(arr[i][j],min));
              maxList.add(Math.max(arr[j][i],max));
            }
        }
       
        for(int each:minList){
            if(maxList.contains(each)){
                System.out.println(each);
            }
            sc.close();
        }
    }
    
}
