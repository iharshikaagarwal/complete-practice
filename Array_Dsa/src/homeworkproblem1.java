//Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class homeworkproblem1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        String [] name = new String[size];
        System.out.println("create a lists of name according your array size");
        for (int i = 0 ; i<size ; i ++ ){
            name[i]= sc.next();
        }
        for (int i = 0 ; i < name.length;i++){
            System.out.println("name"+(i+1)+"is:: "+name[i]);
        }


    }
}

