//a>>3 5 7                           2 5
//   1 2 3 ....................>a^t>>1 3
//                                   3 7
import java.util.*;
public class transpose_matrix {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int [][] matrix = new int[n][m];
        for (int i = 0 ; i< n ; i++){
            for (int j = 0 ; j < n ; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
//        printing a tranpose matrix
        for (int i = 0 ; i<m ; i++){
            for (int j = 0 ; j<n ; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
