public class Main {
    public static void main(String[] args)
    {
//        concatination function of string
        String first_name = "harshika";
        String last_name = " agarwal";
        String full_name = first_name+" "+last_name;
        System.out.println(full_name);
//        comare to function of string
        String name = "harshu";
        String name2 = "harshu";
        if (name.compareTo(name2)==0){
            System.out.println("the strings are same");
        }else {
            System.out.println("not same");
        }
    }
}