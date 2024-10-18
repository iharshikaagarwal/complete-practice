public class LoopInLinkedList {
    Node head ;
    private int size;
    LoopInLinkedList(){
        this.size=0;
    }
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }


    }
    public void addnodeAtFirst(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public  void printList(){
        if(head==null){
            System.out.println("invalid list");
            return;
        }
        Node currentnode =head;
        while (currentnode!=null){

            System.out.print(currentnode.data+">>");

            currentnode=currentnode.next;

        }
        System.out.println("null");
    }
    public boolean CheckCycleOrNotInList(Node head){
        if(head==null){
            return false;
        }
        Node hare = head;
        Node turtle =  head;
        while (hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if (hare==turtle){
                return true;
            }


        }
        return false;


    }
    public void removeloopsinlist(Node head , Node meetnode ){

        if (head==null){
            System.out.println(" list is empty no loop found");
            return;
        }
        Node pointer1 = head;
        Node pointer2 = meetnode;
        while (pointer1.next!=pointer2){
            pointer2=pointer2.next;
            pointer1=pointer1.next;
        }
        pointer2.next=null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String []args){
        LoopInLinkedList list = new LoopInLinkedList();
        list.addnodeAtFirst(5);
        list.addnodeAtFirst(4);
        list.addnodeAtFirst(3);
        list.addnodeAtFirst(2);
        list.addnodeAtFirst(1);
        list.addnodeAtFirst(4);


        list.printList();
        System.out.println("the size of the list is ");
        System.out.println(list.getSize());
        boolean hascycle = list.CheckCycleOrNotInList(list.head);
        list.printList();
        if(hascycle){
            System.out.println("the loop has a cycle ");
        }
        else {
            System.out.println("the list has no cycle ");
        }


    }
}
