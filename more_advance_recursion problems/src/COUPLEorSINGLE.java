public class COUPLEorSINGLE {
    public static int Callguest(int n){
        if(n<=1){
            return 1;
        }
        int single = Callguest(n-1);
        int couples = (n-1)*Callguest(n-2);
        return single+couples;
    }
    public static void main (String[]args){
        int n = 1;
        System.out.println(Callguest(n));

    }
}
