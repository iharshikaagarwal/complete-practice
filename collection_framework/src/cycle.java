public class cycle {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static boolean hasCycle(Node head) {
            if (head == null) {
                return false;
            }

            Node tortoise = head;
            Node hare = head;

            while (hare != null && hare.next != null) {
                tortoise = tortoise.next;
                hare = hare.next.next;

                if (tortoise == hare) {
                    return true; // Cycle detected
                }
            }

            return false; // No cycle
        }

        static void printList(Node head) {
            while (head != null) {
                System.out.print(head.data + " -> ");
                head = head.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            // Creating a linked list with a cycle
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fifth = new Node(5);

            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = second; // Creating a cycle

            System.out.println("Linked List:");
            printList(head);

            boolean hasCycle = hasCycle(head);

            if (hasCycle) {
                System.out.println("The linked list contains a cycle.");
            } else {
                System.out.println("The linked list does not contain a cycle.");
            }
        }


}
