import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int row = sc.nextInt();
        System.out.println("enter a numbers of columns ");
        int col = sc.nextInt();
        int [][]numbers=new int[row][col];
        System.out.println("crete a matrix according too rows colomn size");
        for (int i = 0 ; i < row;i++){
            for (int j = 0 ; j < col ; j++){
                numbers[i][j]=sc.nextInt();
            }

        }
        System.out.println("here is your matrix");
        for (int i = 0 ; i < row;i++){
            for (int j = 0; j < col;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}