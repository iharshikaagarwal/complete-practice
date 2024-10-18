public class linkedlisthomework1 {
    Node head;
    private int size;
    linkedlisthomework1(){
        this.size=0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addfirst (int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    public void addlast(int data){
        Node newnode =new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node currentnode =head;
        while (currentnode.next!= null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;

        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node secondlastnode = head;
        Node lastnode = head.next;
        while (lastnode.next!=null){
            lastnode.next=lastnode;
            secondlastnode.next=secondlastnode;

        }
        secondlastnode.next=null;
    }
    public void printlist(){
        if (head==null){
            System.out.println("the list is empty");
            return;
        }
        Node currentnode =head;
        while (currentnode!=null){
            System.out.print(currentnode.data+">>");
            currentnode=currentnode.next;

        }
        System.out.println( "Null");
    }
//    homework 1
    public void searchthedata(int data){
        int indx=0;
        Node currentnode=head;
        while (currentnode.next != null){
            if(currentnode.data==data){
                System.out.println("the elemenet"+data+"found at index"+indx);
                return;

            }
            currentnode=currentnode.next;
            indx++;


        }
        System.out.println("the elemenet"+data+"not found at any index");


    }
//    doubt
//    public void deleteNodesGreaterThan25() {
//            if (head == null) {
//                System.out.println("The list is empty");
//                return;
//            }
//
//            Node current = head;
//            Node previous = null;
//
//            while (current != null) {
//                if (current.data > 25) {
//                    if (previous == null) {
//                        // If the node to be deleted is the head
//                        head = current.next;
//                    } else {
//                        // If the node to be deleted is in the middle or at the end
//                        previous.next = current.next;
//                    }
//                    size--; // Decrease the size of the linked list
//                } else {
//                    // Move to the next node
//                    previous = current;
//                }
//
//                // Move to the next node in the list
//                current = current.next;
//            }
//    }


//    homework 2

    

    public int getSize() {
        return size;
    }

    public static void main(String[] args){
        linkedlisthomework1 ll = new linkedlisthomework1();
        for (int i = 0 ; i < 51 ; i ++){
            ll.addlast(i);

        }
        System.out.println("list");
        ll.printlist();
        System.out.println("list after deletion number gertor than 25" );
//        ll.deleteNodesGreaterThan25();
        ll.printlist();

    }
}