package bank;
//here we will also learn the acces modifiers
class Accounts{
    public String name;
    protected String email;
    private String password;
//    password is private to we have to use getter and setter for access it
    public String getPassword(){
        return this.password;
    }
   public void setPassword(String pasword){
        this.password=pasword;
   }

}

public class bankdetails {
    public static void main(String[]args){
        Accounts account1 =new Accounts();
        account1.name="harshika";
        account1.email="iharshika@gmail.com";
        account1.setPassword("harshu");
        System.out.println(account1.getPassword());
    }



}
