import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FindOddElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        oddElement(a,n);
    }
    static void oddElement(int a[],int n){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
          if(h.containsKey(a[i])){
              h.put(a[i],h.get(a[i])+1);
          }
          else{
              h.put(a[i],1);
          }
        }
        for(Map.Entry<Integer,Integer> mapElement : h.entrySet()){
             if(mapElement.getValue()%2!=0)
                System.out.print(mapElement.getKey());
        }
        
    }
    
}
