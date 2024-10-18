//calculate teh power of x in the way taht the height of stack is logn b
public class power {
    public static int Calculate(int x , int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        if (n%2==0){
            return Calculate(x,n/2)*Calculate(x,n/2);
        }else{
            return Calculate(x,n/2)*Calculate(x,n/2)*x;
        }
    }
    public static void main (String[]args){
        int x = 5 ;
        int n = 2 ;
        int ans  = Calculate(x,n);
        System.out.println(ans);

    }
}
