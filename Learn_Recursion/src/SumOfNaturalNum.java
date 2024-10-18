//explain in notebook how the iteration work
public class SumOfNaturalNum {
    public static void PrintSum(int i , int n , int sum){
        if (i==n){
            sum += i ;
            System.out.println(sum);
            return;
        }
        sum += i;
        PrintSum(i+1 , n , sum);
//         next sum is for understanding the concept that how its is updating the value of sum
//        System.out.println(sum);
    }
    public static void main (String []args){
        PrintSum(1,5,0);
    }
}
