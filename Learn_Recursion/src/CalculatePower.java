//calculate teh power of so that the height of stack is  n ;
public class CalculatePower {
    public static int Calculate(int x , int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int powerofnumber = Calculate(x,n-1);
        int Xpower = x* powerofnumber;
        return Xpower;



    }
    public static void main (String[]args){
        int x = 5 ;
        int n = 2 ;
        int ans  = Calculate(x,n);
        System.out.println(ans);

    }
}
