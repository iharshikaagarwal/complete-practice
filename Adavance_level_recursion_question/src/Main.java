//tower of henoi
public class Main {
    public static void TowerOfHenoni(int n  , String src , String helper , String destination){
        if (n == 1){
            System.out.println("transfer disk "+n +src+" to "+ destination);
            return;
        }
        TowerOfHenoni(n-1 , src,destination,helper);
        System.out.println("transfer disk "+n +src+" to "+ destination);
        TowerOfHenoni(n-1, helper,src,destination);

    }
    public static void main(String[] args) {
        int n = 3;
        TowerOfHenoni(n , "s","h","d");
    }
}