//swaping 1>2>3>4>5
// to 1>4>3>2>5
public class home3_leetcode {
    Node head;
    private int size;
    home3_leetcode(){
        this.size=0;
    }
    public class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void adddata(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void printlist(){
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
    public Node reverseBetween(Node head , int left ,int right ){
        if(head==null || head.next==null){
            return head;
        }
        Node dummy = new Node(-1);
        dummy.next=head;
        Node It = dummy;
        Node prevIt  = null;
        for (int i = 0 ; i< left; i++){
            prevIt = It;
            It = It.next;
        }
        Node prevItR = prevIt;
        Node ItR = It;
        for (int i = left ; i <= right ; i++){
            Node forward = ItR.next;
            ItR.next=prevItR;
            prevItR=ItR;
            ItR=forward;
        }
        prevIt.next=prevItR;
        It.next=ItR;
        return dummy.next;
    }

    public static void main(String[]args){
        home3_leetcode list =new home3_leetcode();
        list.adddata(5);
        list.adddata(4);
        list.adddata(3);
        list.adddata(2);
        list.adddata(1);
        list.printlist();
        list.head = list . reverseBetween(list.head ,2 , 4 );
        list.printlist();

    }
}
