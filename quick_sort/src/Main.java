public class Main {
    public static int partition(int[]arr,int low ,int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low ; j <high ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp =arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int[]arr,int low ,int high){
        if(low<high){
            int pivotindx = partition (arr,low ,high);
            quicksort(arr , low ,pivotindx-1);
            quicksort(arr,pivotindx+1 ,high);
        }
    }
    public static void main(String[] args) {
        int[]arr={8,9,1,5,2,4};
        int n = arr.length;
        quicksort(arr,0,n-1);
        for (int i = 0 ; i <n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
