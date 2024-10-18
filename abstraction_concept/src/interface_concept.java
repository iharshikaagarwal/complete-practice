//it is a concept of pure abstraction
// in which iterface is use at the plave of class
// and  implement is used at place of extends
interface Animals{
    int eyes =2;
    void walk();
}
interface harbivore{

}
class Horse  implements Animals , harbivore{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
public class interface_concept {
}
