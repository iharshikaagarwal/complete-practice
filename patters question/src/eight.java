public class eight {
    public static void main(String[]args){
        int n=5;
        for ( int i = n ; i>= 1;i--){
            for (int j =1; j<= i ; j++){
                System.out.print(j + " ");
//                if here I   will print i  at the place of j than the  otput will be 1 22 333 4444 55555
            }
            System.out.println();
        }
    }
}
