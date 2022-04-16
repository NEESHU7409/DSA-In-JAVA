package Matrix2D;

public class MultiplicationOfMatrix {
    public static void main(String[] args){
        int[][] mat_1={{1,2},{3,3}};
        int[][] mat_2={{4,1},{8,2}};
        mul(mat_1,mat_2);
    }
    static void mul(int[][] mat_1,int[][] mat_2){
        int m1=mat_1.length;
        int m2=mat_2.length;
        int n1=mat_1[0].length;
        int n2=mat_2[0].length;
        int[][] res=new int[m1][n2];
        if(n1!=m2){
            System.out.print("Multiplication is not possible");
        }
        else{
            int sum=0;
            for(int k=0;k<m1;k++){
                for(int i=0;i<n1;i++){
                    for(int j=0;j<n2;j++){
                      sum+=mat_1[i][0]*mat_2[j][i];
                    }
                    System.out.println(sum +" ");
                    res[k][i]=sum;
                    sum=0;
                }
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
        }

    }
}
