import bank.*;
class shape {
    public void area(){
        System.out.println("area");
    }
}
class triangle extends shape{
    public void area(int l ,int h){
        System.out.println(1/2*l*h);
    }
}
class  circle extends shape{
    public void area(int r){
        System.out.println(3.17*r*r);
    }
}
class Eqilateraltriangle extends triangle{
    public void area(int h, int l){
        System.out.println(1/2*h*l);
    }
}


public class hybride_inheritance {
    public static void main(String[]args){
    }

    }
}
