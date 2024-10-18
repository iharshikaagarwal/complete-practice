class Student{
    String name ;
    int  age;
    public void print_info(){
        System.out.println("the name of studnt is "+this.name);
        System.out.println("the age of this student is "+this.age);
    }
}
public class basic_students_opps {
    public static void main(String[]args){
        Student student1 = new Student();
        Student student2 = new Student();
        student2.name="harshika";
        student1.name ="harsh";
        student2.age=19;
        student1.age=21;
        student1.print_info();
        student2.print_info();
    }


}
