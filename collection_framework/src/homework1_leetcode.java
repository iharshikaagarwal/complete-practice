//swap the pairs means 1>>2>>3>>4 to 2>>1>>4>>3
public class homework1_leetcode {

        Node head;
        private int size;
        homework1_leetcode(){

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
        public Node swappairs(Node head){
            if(head==null||head.next==null){
                return head;
            }
            Node secondnode = head.next;
            Node third = secondnode.next;
            secondnode.next=head;
            head.next =swappairs(third);
            return secondnode;
        }
        public static void main(String[]args){
            homework1_leetcode ll =new homework1_leetcode();
//            ll.addFirst(5);
//        for first
            ll.addFirst(4);
            ll.addFirst(3);
            ll.addFirst(2);
           ll.addFirst(1);
            ll.print_list();
            ll.head=ll.swappairs(ll.head);
            ll.print_list();



        }




}
