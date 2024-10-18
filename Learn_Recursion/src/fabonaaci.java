public class fabonaaci {
    public static void CalculateFabonacci(int n , int a,int b){
        if (n==0){
            return;
        }
      int c = a+b;
        System.out.println(c);
      CalculateFabonacci(n-1,b,c);

    }
    public static void main(String []args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n =7  ;
        CalculateFabonacci( n-2,a,b);
    }
}
