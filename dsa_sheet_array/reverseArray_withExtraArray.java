public class reverseArray_withExtraArray {
    public static void reverseArray(int[]arr){
        int []reversearray=new int [arr.length];
        for (int i =0 ; i < arr.length;i++){
            reversearray[i]=arr[arr.length-i-1];
        }
        System.out.println("reversed the array");
        for (int i : reversearray ){
            System.out.print(i+" ");
        }
    }
    public static void main(String[]args){
        int originalArray[]={1,2,3,4,5,6,7};
        reverseArray(originalArray);
    }
}
