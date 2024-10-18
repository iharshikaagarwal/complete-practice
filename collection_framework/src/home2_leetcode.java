
//return the nthelement  from the list
public class home2_leetcode {

        Node head;
        private int size;
        home2_leetcode(){

            this.size=0;
        }
        public class Node{
            int data ;
            Node next ;
            Node (int data){
                this.data= data;
                this.next=null;
                size++;
            }
        }
        public void addFirst (int data){

            Node newnode =new Node(data);
            if(head==null){
                head =newnode;
                return;
            }
            newnode.next= head ;
            head = newnode;
        }
        public void print_list( ){
            if (head==null){
                System.out.print ("list is empty");
                return;
            }
            Node currentnode = head;
            while (currentnode!=null){
                System.out.print(currentnode.data+">>");
                currentnode=currentnode.next;
            }
            System.out.println("Null");

        }
public Node deletenthelement(int n) {
    if (head == null || n == 0 || n > size||head.next==null) {
        System.out.println("Invalid or list is empty");
        return null;
    }
    if (n==size){
        return head.next;
    }
    int indextosearch = size - n ;
//    size -n means 5-2=3 means 3rd index
//    the formula is (size-n)+1 its gives (5-4)+1 = 4th indez its is an index from start we have to delete
//
     Node previous = head;
     int i=1;
     while (i<indextosearch){
         previous=previous.next;
         i++;
     }
     previous.next=previous.next.next;
     return head;
}


//    Node dummy = new Node(0);
//    dummy.next = head;
//    Node first = dummy;
//    Node second = dummy;
//
//    // Move the first pointer n+1 steps ahead
//    for (int i = 0; i <= n; i++) {
//        if (first == null) {
//            System.out.println("Invalid value of n");
//            return;
//        }
//        first = first.next;
//    }
//
//    // Move both pointers until the first pointer reaches the end
//    while (first != null) {
//        first = first.next;
//        second = second.next;
//    }
//
//    // Remove the nth node from the end
//    second.next = second.next.next;
//    head = dummy.next;
//}

    public static void main(String[]args){
            home2_leetcode ll =new home2_leetcode();
//            ll.addFirst(5);
//        for first
            ll.addFirst(5);

            ll.addFirst(4);
            ll.addFirst(3);
            ll.addFirst(2);
            ll.addFirst(1);
            ll.print_list();
            int n = 2 ;
            ll.deletenthelement(n);
            ll.print_list();




        }







}
