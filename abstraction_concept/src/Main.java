abstract class Animal{

    abstract void walk();
//      at the place of this...  public void walk(){}
//      beacuse that function is important
//      but not for user
    public void eat(){
        System.out.println("animals eat");
    }
    Animal(){
        System.out.println("you are animal");
    }
}
//here you can see that the user does not need
// the animal class as u can se ethe hourse and chicken class
// there which is alredy inherits the property of animal class
// "so we will abstract the animal class"
class horse extends Animal{
    horse(){
        System.out.println("horse is an animal");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 leg");
    }
}
public class Main {
    public static void main(String[] args) {
        horse Horse =new horse();
//        chicken Chicken =new chicken();
//        Horse.walk();
//        Chicken.walk();
        Horse.eat();
    }
}