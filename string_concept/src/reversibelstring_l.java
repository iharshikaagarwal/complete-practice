public class reversibelstring_l {
    public static void main(String[]args){
        StringBuilder name = new StringBuilder("naitik");
        System.out.println(name.length());
        for (int i = 0 ; i< name.length()/2;i++){
        int front = i ;
        int back = name.length()-1-i;
        char frontChar = name.charAt(front);
        char backchar = name.charAt(back);
        name.setCharAt(front,backchar);
        name.setCharAt(back,frontChar);
        }
        System.out.println(name);
    }
}
