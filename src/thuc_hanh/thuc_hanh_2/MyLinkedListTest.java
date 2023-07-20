package thuc_hanh.thuc_hanh_2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst("13");

        ll.add(1,9);
        ll.add(4,"Hello");
        ll.printList();
        System.out.println(ll.get(2));

        MyLinkedList.Node a = new MyLinkedList(2).new Node(4);
        System.out.println(a.getNext());

    }
}
