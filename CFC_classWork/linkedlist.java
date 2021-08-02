package practices.CFC_classWork;

public class linkedlist {
    static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
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
    }
    public void addLast(int data){
        Node node = new Node(data);
        if(size == 0){
            head = node;
            tail = node;
            size++;
        }
        else{
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public void addFirst(int data){
        if(size == 0){
            addLast(data);
            return;
        }
        else{
            Node node = new Node(data);
                node.next = head;
                head = node;
                size++;
        }
    }
    public Integer removeLast(){
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return null;
        }
        if(size == 1){
            int ans = head.value;
            head = null;
            tail = null;
            size--;
            return ans;
        }
        size--;
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next();
        }
        int ans = tail.value;
        temp.next = null;
        tail = temp;
    }
    public Integer removeFirst(){
        if(size <= 1){
            removeLast();
            return;
        }
        else{
            int ans = head.value;
            head = head.next;
            size--;
            return ans;
        }
        2public void display(){
            if(size == 0){
                System.out.println("LinkedList is Empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {

        customLinkedList l1 = new customLinkedList();
//        l1.addLast(15);
//        l1.addLast(68);
//        l1.addFirst(25);
        l1.removeLast();
        l1.removeFirst();
        l1.display();


    }
}
