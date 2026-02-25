

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head = new Node(-1);
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.cycle(l.head);  
        System.out.println(l.cycleExists(l.head));
        System.out.println(l.cycleBegin(l.head));
    }

    public void insert(int data) {
        Node n = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    public void cycle(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head.next.next; 
    }

    //CYCLE DETECTION
    public boolean cycleExists(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;          
            fast = fast.next.next;     
            if (slow == fast)
                return true;
        }
        return false;
    }

    //CYCLE BEGINNING
    public int cycleBegin(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;          
            fast = fast.next.next;     
            if (slow == fast) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }return slow.data;
            } 
        }return -1;
    }
}