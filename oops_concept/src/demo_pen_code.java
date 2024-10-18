class pen{
    String color ;
    String type;
//    type means ball , gell
    public void write (){
        System.out.println("write something");

    }
    public void penColor(){
        System.out.println(this.color);
//        here the "this" keyword is used for just telling which object propert have  to call
    }
}
public class demo_pen_code {
    public static void main(String[]args){
        pen pen1 = new pen();
        pen1.color="red";
        pen1.type="gell";
        pen1.write();
        pen pen2 = new pen();
        pen2.color="black";
        pen2.penColor();

    }


}
