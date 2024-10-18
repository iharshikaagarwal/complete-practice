import java.util.Scanner;
//buble sort

public class Main {
    public static void printarray(int arr[]){
        for (int i =0 ; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//    bubble short
        int []arr= {7, 8, 9, 5};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//        System.out.println("print the list u want to bubbel short");
//        for(int i = 0 ; i<size ; i++){
//            arr[i]=sc.nextInt();
//        }
        for (int i = 0 ; i < arr.length-1; i++){
            for (int j = 0 ; j< arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    //                swapping here
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr [j+1]=temp;
                }
            }
        }
        printarray(arr);

    }
}