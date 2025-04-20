package prep.interview.list;

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }


    public void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
      Node current = head;
      Node next = null;
      Node prev = null;
      while(current != null) {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
      head = prev;
    }

    public Node reverse(Node head) {
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev;
    }

    public Node reverse(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;
        while(count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverse(next, k);
        }
       return  prev;
    }

    private static LinkedList sumList(LinkedList first, LinkedList second) {

        int num1 = 0, num2 = 0;
        while (first.head != null) {
            num1 = num1 * 10 + first.head.data;
            first.head = first.head.next;
        }
        while (second.head != null) {
            num2 = num2 * 10 + second.head.data;
            second.head = second.head.next;
        }
        int num3 = num1 + num2;

        LinkedList temp = new LinkedList();
        while (num3 != 0) {
            int last = num3 % 10;
            temp.push(last);
            num3 = num3 / 10;
        }
        return temp;
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.print();
        llist.reverse();
        llist.print();
        llist.head = llist.reverse(llist.head, 3);
        llist.print();

        // sum list
        LinkedList llist1 = new LinkedList();
        llist1.push(9);
        llist1.push(8);
        llist1.push(7);
        llist1.print();
        LinkedList llist2 = new LinkedList();
        llist2.push(3);
        llist2.push(2);
        llist2.push(1);
        llist2.print();

        LinkedList llist3 = sumList(llist1, llist2);
        llist3.print();
    }
}
