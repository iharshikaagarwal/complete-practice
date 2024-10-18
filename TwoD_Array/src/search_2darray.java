import java.util.Scanner;

public class search_2darray {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of rows ");
        int row = sc.nextInt();
        System.out.println("enter a number of cols");
        int col = sc.nextInt();
        int [][]numbers = new int[row][col];
        System.out.println("crete a matrix accordind to row and coloumn size ");
        for (int i = 0 ; i <row ;i++){
            for (int j = 0 ; j< col ; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("write a number which you have to find ");
        int x = sc.nextInt();
        for (int i = 0 ; i< row;i++){
            for (int j =0;j<col; j ++){
                if (numbers[i][j]==x){
                    System.out.println("noumber is found on index ::" + "("+ i+","+j+")");
                }
            }
        }
    }
}
