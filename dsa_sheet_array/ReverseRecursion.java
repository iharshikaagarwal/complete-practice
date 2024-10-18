public class ReverseRecursion {
    public static void reversearray(int arr[], int start , int end){
        int temp;
        if (start>=end){
            return;
        }
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reversearray(arr,start+1,end-1);

    }
    static void printarray(int arr[],int size){
        for (int i= 0; i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[]args){
        int originalarray[]={9,6,3,5,2,4,6};
        printarray(originalarray,7);
        reversearray(originalarray,0,6);
        printarray(originalarray,7);
    }
}
