//get bit
public class Main {
    public static void main(String[] args) {
        int n = 5 ;//       5 in binary 0101
        int pos = 3 ;           //       if pos chages answer cahnges
        int bitmask = 1 << pos;
        if ((bitmask&n) == 0){
            System.out.println("the bit was zero");

        } else {
            System.out.println("the bit was one");
        }
    }
}