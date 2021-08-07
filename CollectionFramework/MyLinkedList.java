package practices.CollectionFramework;


    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }
    class LinkedList{
        int size;
        Node head;
        Node tail;

        void add(int val){
            Node node = new Node(val);
            if (size == 0) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            size++;
        }

        void add(int index, int val) {
            Node node = new Node(val);

            size++;
           if (index == 0) {
                node.next = head;
                head = node;
           } else {
               Node temp = head;
               for (int i = 1; i < index; i++) {
                   temp = temp.next;
               }
               node.next = temp.next;
               temp.next = node;
           }
        }
        void remove() {
            if (size == 0) {
                System.out.println("LinkedList is Empty");
            }else if(size == 1){
                head = null;
                tail = null;
                size--;
            }else{
                Node temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }
        }
        void remove(int index) {
            if (index == size - 1) {
                remove();
            }
            else if (index == 0) {
                head = head.next;
                size--;
            } else {
                Node temp = head;
                for (int i = 1; i < index; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        void display() {
            if (size == 0) {
                System.out.println("LinkedList is Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
public class MyLinkedList {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add(64);
        ll.add(79);
        ll.add(184);
        ll.add(22);
        ll.add(6418);
        ll.add(98);
        ll.add(1864);
        ll.add(0,1604);
//        ll.remove(0);
        ll.display();
        System.out.println(ll.size);
    }
}
