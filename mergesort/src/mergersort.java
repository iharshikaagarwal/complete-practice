public class mergersort {
//    conqure
    public static void conqure(int[]arr , int startindx ,int mid ,int endindx){
        int merged []= new  int [endindx - startindx +1];
        int indx1=startindx;
        int indx2 = mid+1;
        int x=0;
        while (indx1<=mid && indx2<=endindx){
            if (arr[indx1]<= arr[indx2]){
                merged[x]=arr[indx1];
                x++;indx1++;
//           merged[x++]=arr[indx1++];    so we dont have to write
//          x++;indx1++;
            }else {
                merged[x++]=arr[indx2++];

            }

        }
        while (indx1<= mid){
            merged[x++]=arr[indx1++];
        }
        while (indx2 <= endindx){
            merged[x++]=arr[indx2++];
        }
        for (int i = 0 , j =startindx;i<merged.length ; i++,j++){
            arr[j]=merged[i];
        }


    }
//    divide
    public static void divide(int []arr , int startindx ,int endindx){
        if (startindx>=endindx){
            return;
        }
        int midindx = startindx+(endindx-startindx)/2;

//       we can use this lakin   sometimes it occurs problem (startindx+endindx)/2
        divide(arr,startindx,midindx);
        divide(arr,midindx+1,endindx);
        conqure(arr,startindx,midindx,endindx);
    }
    public static void main(String[]args){
        int []arr ={6,3,9,5,2,8};
        int n= arr.length;
        divide(arr,0,n-1);
        for (int i = 0 ; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
