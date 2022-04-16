package Matrix2D;

public class SnakePattern {
    public static void main(String[] args){
        int arr[][]={{10,20,30,40},{50,60,70,80},{27,29,47,48},{32,33,39,60}};
        //oddeven  logic
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
            for(int j=0;j<arr[0].length;j++){
              System.out.print(arr[i][j] +" ");
            }
        }
        else{
            for(int k=(arr[0].length-1);k>=0;k--){
            System.out.print(arr[i][k] +" ");
            }
            System.out.println();
        }
        }
    }
}
