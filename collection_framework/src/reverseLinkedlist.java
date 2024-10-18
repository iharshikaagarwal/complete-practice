public class reverseLinkedlist {
    Node head;
    private int size ;
    reverseLinkedlist(){
        this.size=0;
    }
    public class Node{
        String data;
        Node next ;
        Node(String data){
            this.data = data;
            this.next =null;
            size++;
        }

    }
    public void  addfirst (String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next =head;
        head = newnode;
    }
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currentnode = head;
        while (currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;

    }
    public void deletelast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlastnode = head;
        Node lastnode = head.next;
        while (lastnode.next!=null){
            lastnode=lastnode.next;
            secondlastnode=secondlastnode.next;
        }
        secondlastnode.next=null;
    }
//    reveriteratevely
    public void reverseinteratevly(){
        if (head==null|| head.next==null){
            return;
        }
        Node previousnode = head;
        Node currrentnode =head.next;
        while (currrentnode!=null){
            Node nextnode = currrentnode.next;
            currrentnode.next= previousnode;
            previousnode = currrentnode;
            currrentnode = nextnode;

        }
        head.next=null;
        head=previousnode;

    }
//    recursive method
    public Node reversebyrecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newhead =  reversebyrecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public void printlist(){
        if(head==null){
            System.out.println("the lsit is empty");
            return;
        }
        Node currentnode = head;
        while (currentnode!=null){
            System.out.print(currentnode.data+">>");
            currentnode=currentnode.next;
        }
        System.out.println("Null");
    }
    public int getsize(){
        return size;
    }
    public static void main(String []args){
        reverseLinkedlist ll = new reverseLinkedlist();
        ll.addfirst("9");
        ll.addfirst("8");
        ll.addfirst("7");
        ll.addfirst("6");
        ll.addfirst("5");

        ll.printlist();
        ll.reverseinteratevly();
        ll.printlist();
        ll.head=ll.reversebyrecursive(ll.head);
        ll.printlist();
    }
}
