class std{
    String name;
    int age;
    public void std_inf(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    std(std s2){
        this.name =s2.name;
        this.age =s2.age;
    }
    std(){}
}
public class copy_constructor{
    public static void main(String[]args){
        std s1 = new std();

        s1.name="harshi";
        s1.age=19;
        std s2 = new std(s1);
        s2.std_inf();

    }
}