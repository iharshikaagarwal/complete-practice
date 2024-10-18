public class PlaceTiles {
    public static int TotalWaysOfPlaceTiles(int n , int m){
        if (n == m ){
            return 2;
        }
        if (n<m ){
            return 1;
        }
        int vericalpacement = TotalWaysOfPlaceTiles(n-m , m);
        int horizontalTiles = TotalWaysOfPlaceTiles(n - 1 , m );
        return vericalpacement+horizontalTiles;
    }
    public static void main(String []args){
        int n = 4 ,m =2 ;
        System.out.println(TotalWaysOfPlaceTiles(n,m));
    }
}
