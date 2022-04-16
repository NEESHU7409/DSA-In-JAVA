package Matrix2D;

public class LowerAndUpperTriangleSum {
    public static void main(String[] args){
     int[][] mat_1={{1,2,3},{4,5,6},{7,8,9}};
     upperSum(mat_1);
     lowerSum(mat_1);
    }
    static void upperSum(int[][] mat_1){
        int sum=0;
        for(int i=0;i<mat_1.length;i++){
            for(int j=i;j<mat_1.length;j++){
                sum+=mat_1[i][j];
            }
        }
        System.out.print(sum);
        System.out.println();
    }
    static void lowerSum(int[][] mat_1){
        int first=0;
        int sum=0;
        for(int i=first;i<mat_1.length;i++){
            for(int j=i;j<mat_1.length;j++){
                sum+=mat_1[j][i];
            }
            first++;
        }
        System.out.print(sum);
        System.out.println();
    }
}
