public class ReverseUsingLoop {
    public static void reverse(int arr[],int start , int end ){
        int temp ;
        while (start < end ){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printarray (int arr[],int size){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[]args){
        int originalarray[]={1,2,3,4,5,6,7,5};
        printarray(originalarray,8);
        reverse(originalarray,0,7);
        printarray(originalarray,8);
    }
}
