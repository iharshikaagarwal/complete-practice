import java.util.Arrays;

public class ChoclatedistributeProblem {
    static int ChocolateDistribute(int n , int m,int[]arr){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i =0;i+m-1<n;i++){
            int diff = arr[i+m-1]-arr[i];
            if (diff<min){
                min=diff;
            }
        }
        return min;
    }
    public static void main(String[]args){
        int arr[]={2,3,4,3,4,6,8,6,7,4,26,5,8,4};
        int m= 5;
        int n= arr.length;
        System.out.println(ChocolateDistribute(n,m,arr));
    }
}
