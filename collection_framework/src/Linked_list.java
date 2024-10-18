//first is an scratch code
public class Linked_list {
     Node head;
     private int size;
     Linked_list(){

         this.size=0;
     }
    public class Node{
        String data ;
        Node next ;
        Node (String data){
            this.data= data;
            this.next=null;
            size++;
        }
    }
    public void addFirst (String data){

        Node newnode =new Node(data);
        if(head==null){
            head =newnode;
            return;
        }
        newnode.next= head ;
        head = newnode;
    }
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currentnode = head;
        while (currentnode.next !=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;

    }
    public void addmiddel(int indx , String data){
         if (indx > size|| indx<0){
             System.out.println("invalid indx");
             return;
         }
         size++;
        Node newnode = new Node(data);
         if (head==null|| indx==0){
             newnode.next=head;
             head=newnode;
             return;
         }
         Node currentnode = head;
         for (int i = 1 ; i < size ; i ++){
             if (i == indx){
                 Node nextnode = currentnode.next;
                 currentnode.next= newnode ;
                 newnode.next=nextnode;
                 break;

             }
            currentnode= currentnode.next;
         }

    }

    public void delete_first(){
        if (head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void delete_last(){
        if (head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
//        if single node is there
        if (head.next==null){
            head=null;
            return;
        }
        Node secondnode=head;
        Node lastnode = head.next;

        while (lastnode.next!=null){
            lastnode=lastnode.next;
            secondnode=secondnode.next;
        }
        secondnode.next=null;

    }
    public int getSize(){
         return size;
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

    public static void main(String[]args){
        Linked_list ll =new Linked_list();
        ll.addFirst("harshi");
//        for first
        ll.addFirst("i am ");
        ll.addFirst("hey");
        ll.addlast("agarwal");
//        for adding last element
        ll.delete_first();
        ll.delete_last();
        ll.print_list();
        ll.addmiddel(2," agarwal");
        ll.print_list();
        System.out.println(ll.getSize());

    }

}
