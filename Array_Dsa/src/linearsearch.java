import java.util.Scanner;

public class linearsearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what size of list u want ");
        int size =  sc.nextInt();
        int [] numbers = new int[size];
        for (int i  =  0 ; i < size;i++){
            System.out.println("crete a number list of your size ");
            numbers[i]= sc.nextInt();
        }
        System.out.println("type the number you want to find");
        int x= sc.nextInt();
        for (int i = 0 ; i < numbers.length;i++){
            if (numbers[i]==x){
                System.out.println("the x fount at the index  : "+i );
            }
        }
    }
}
