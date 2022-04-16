package Matrix2D;

public class RotateMatrixBy90Degree {
    public static void main(String[] args){
        int[][] mat_1={{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat_1);

    }
    static void rotate(int[][] mat_1){
        int n=mat_1.length-1;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int temp=mat_1[i][j];
                mat_1[i][j]=mat_1[j][i];
                mat_1[j][i]=temp;
            }
        }
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<=n;j++){
                int temp=mat_1[i][j];
                mat_1[i][j]=mat_1[n-i][j];
                mat_1[n-i][j]=temp;
            }
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(mat_1[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
