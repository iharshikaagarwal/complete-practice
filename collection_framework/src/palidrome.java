public class palidrome {
        Node head;
        private int size;
        palidrome(){
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
        public Node reverse(Node head){
            Node previous = null;
            Node current = head;
            while (current!= null){
                Node next = current.next;
                current.next=previous;
                previous =current;
                current=next;

            }
            return previous;
        }
        public Node findMiddle(Node head){
            Node hare = head;
            Node tuttle = head;
             while (hare.next==null || hare.next.next==null){
                 hare=hare.next.next;
                 tuttle=tuttle.next;
             }
             return tuttle;
        }
        public boolean palidrome(Node head){
            if (head==null|| head.next==null){
                return true;
            }
            Node middle = findMiddle(head);
            Node secondHalfStart = reverse(middle.next);
            Node firstHalfStart = head;
            while (secondHalfStart!= null){
                if (firstHalfStart!=secondHalfStart){
                    return false;
                }
                firstHalfStart=firstHalfStart.next;
                secondHalfStart=secondHalfStart.next;
            }
            return true;

        }
        public int getsize(){
            return size;
        }

        public static void main(String[]args){
            palidrome list =new palidrome();
            list.adddata(5);
            list.adddata(4);
            list.adddata(3);
            list.adddata(2);
            list.adddata(1);
            list.printlist();


        }



}
