class students{
    String name;
    static String schoolName;
}
public class Static_concept {
    public static void main(String[]args){
        students.schoolName="emmanuel";
//        staic is not for object can declare directly
        students s1 = new students();
        System.out.println(s1.name="harsh");
        System.out.println(s1.schoolName);
    }
}
