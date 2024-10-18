
//this is for non non parmeterize concept
class Pen{
    String color ,type ;
    public void pen_info(){
        System.out.println(this.color);
        System.out.println(this.type);

    }
}
//this is for parametrize concept
class student{
    String name ;
    int age ;
    public void student_info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(String name , int age){
        this.name=name;
        this.age=age ;
    }
}
public class constructor_concept {
    public static void main(String[]args){
        Pen pen1 = new Pen();
        pen1.color="black";
        pen1.type="ball";
        pen1.pen_info();
     //this is for parametrize concept
        student student1 =new student("harshi", 19 );
        student1.student_info();

    }
}
