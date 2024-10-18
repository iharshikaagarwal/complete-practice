import java.util.Scanner;

public class sortedArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("the size of array is ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0 ; i< size;i++){
            numbers[i]=sc.nextInt();
        }
        boolean isAscending = true;
        for (int i =0; i<numbers.length - 1 ;i++){
            if (numbers[i]>numbers[i+1]){
                isAscending = false;
                break;
            }
        }
        if (isAscending){
            System.out.println("the array is shorted");
        }else {
            System.out.println("the array is not sorted ");
        }
    }
}

