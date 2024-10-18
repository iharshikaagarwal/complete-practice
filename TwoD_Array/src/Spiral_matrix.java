import java.util.Scanner;

public class Spiral_matrix {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("rows");
        int n = sc.nextInt();
        System.out.println("columns");
        int m = sc.nextInt();
        int [][] numbers = new int[n][m];
        System.out.println("crete a matrix");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j<m ; j ++){
                numbers[i][j]= sc.nextInt();
            }
        }
//        spriral matric willl be showed as
        System.out.println("the sprial matrix order is :: ");
        int row_start =0;
        int row_end = n-1 ;
        int col_start = 0 ;
        int col_end = m-1;
        while (row_start<=row_end && col_start<=col_end){
            for (int col = col_start;col<=col_end;col++){
                System.out.print(numbers[row_start][col]);

            }
            row_start++;
            for (int row = row_start;row <= row_end;row++){
                System.out.print(numbers[row][col_end]);

            }
            col_end--;
            for (int col= col_end;col>=col_start;col--){
                System.out.print(numbers[row_end][col]);

            }
            row_end--;
            for (int row = row_end ; row>=row_start;row--){
                System.out.print(numbers[row][col_start]);

            }
            col_start++;
        }
    }
}
