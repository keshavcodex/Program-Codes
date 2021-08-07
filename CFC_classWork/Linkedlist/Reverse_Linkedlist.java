package practices.CFC_classWork.Linkedlist;

public class Reverse_Linkedlist {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }
    static class customLinkedList{
        int size;
        Node head, tail;
        customLinkedList(){
            size = 0;
            head = null;
            tail = null;
        }
        void add(int val) {
            Node node = new Node(val);
            if (size == 0) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            size++;
        }
        void display(){
            if(size == 0){
                System.out.println("Linked List is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        Node reverseLL(){
        Node prev = null, curr = head, forw = head;
            while(forw != null){
                forw = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forw;
            }
        return prev;
        }

    }
    public static void main(String[] args){
        customLinkedList ll = new customLinkedList();
        ll.add(98);
        ll.add(55);
        ll.add(78);
        ll.add(89);
        ll.add(13);
        ll.add(27);
        ll.add(387);
        ll.display();
        ll.head = ll.reverseLL();
        ll.display();
    }
}
