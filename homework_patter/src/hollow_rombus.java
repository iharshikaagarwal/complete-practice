public class hollow_rombus {
    public static void main(String []args){
        int n = 5;
        for (int i = 1 ; i <= n ;i++ ){
            for (int j = n-i ; j >= 0; j--){
                System.out.print(" ");
            }
            for (int j = 1 ;j <=n ; j++ ){
                if (j==1|| i==1|| j==n || i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}
