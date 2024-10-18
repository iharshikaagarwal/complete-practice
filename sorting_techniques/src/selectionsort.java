public class selectionsort {
    public static void main(String[]args){
        int arr[] ={7,8,3,1,2};
        for (int i = 0 ; i< arr.length-1;i++){
            int smallestElement =i;
            for (int j = i+1 ;j< arr.length;j++){
                if(arr[j]<arr[smallestElement]){
                    smallestElement=j;
                }
            }
            int temp = arr[smallestElement];
            arr[smallestElement]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);

    }
    public static void printArray(int arr[]){
        for (int i =0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
