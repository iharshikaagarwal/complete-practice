import java.util.*;
public class new_concept {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int PositiveCounter = 0 ;
        int NegetiveCounter = 0 ;
        int Zerocounter = 0;
        for (int i = 1 ; i > 0 ; i ++ ){

            System.out.println("enter a number");
            int number = sc.nextInt();
            if (number>0){
                PositiveCounter++;
            } else if (number<0) {
                NegetiveCounter++;
            }else {
                Zerocounter++;
            }
            System.out.println(" want to chose(c) another number select 1 for yes & 0 for no");
            int c = sc.nextInt();
            if (c==0) break;
            else continue;
        }
        System.out.println("the positive number are:"+PositiveCounter);
        System.out.println("the NEGitive number are:"+NegetiveCounter);
        System.out.println("the ZERO number are:"+Zerocounter);




    }
}


