public class set_bit {
    public static void main(String[] args) {
        int n = 5 ;//       5 in binary 0101
        int pos = 1;           //       if pos chages answer cahnges
        int bitmask = 1 << pos;
        int newnumber = bitmask | n;
        System.out.println(newnumber);
    }
}
