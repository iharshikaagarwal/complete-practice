public class queuebylinkedlist {
    static  class node {
        int data;
        node next;
        node(int data){
            this.data= data;
            next=null;

        }
    }
    static class queue{
            static node head=null;
            static node tail=null;
            public static boolean isEmpty(){

                return head ==null&& tail==null;
            }
            public static void add(int data){
                node newnode = new node(data);
                if(isEmpty()){
                    tail=head=newnode;
                    return;
                }
                tail.next=newnode;
                tail=newnode;

            }
            public static int remove(){
                if(isEmpty()){
                    System.out.println("the queue is empty ");
                    return -1;

                }
                int front = head.data;
                if(tail==head){
                    tail=null;
                }
                head=head.next;
                return front;
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("the queue s empty");
                    return -1;

                }
                return head.data;
            }






    }
    public static void main (String[]args){
        queue q = new queue ();
        q.add(8);
        q.add(5);
        q.add(9);
        q.add(2);
        q.add(1);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }


    }

}
