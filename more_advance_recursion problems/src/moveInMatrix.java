public class moveInMatrix {
    public static int CountPAths(int i , int j , int n , int m){
        if (i==n || j ==m){
            return 0;
        }
        if (i == n - 1 && j == m -1){
            return 1;
        }
        int downpath =CountPAths(i+1 , j ,n, m );
        int rightpaths = CountPAths(i,j+1,n , m);
        return downpath+rightpaths;


    }
    public static void main(String[]args){
        int n =3 , m = 3 ;
        int totalpath = CountPAths(0 , 0 , n , m);
        System.out.println(totalpath);

    }
}
