public class clear_bit {
    public static void main(String[] args) {
        int n = 5 ;//       5 in binary 0101
        int pos = 2;           //       if pos chages answer cahnges
        int bitmask = 1 << pos;
        int notbitmask = ~(bitmask);
        int newnumber = notbitmask & n ;
        System.out.println(newnumber);

    }

}
