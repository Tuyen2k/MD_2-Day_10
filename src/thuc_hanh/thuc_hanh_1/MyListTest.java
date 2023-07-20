package thuc_hanh.thuc_hanh_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        System.out.println("Size: "+listInteger.getSize());
        System.out.println("DEFAULT_CAPACITY: "+listInteger.getDEFAULT_CAPACITY());
        listInteger.add(23);
        listInteger.add(25);
        listInteger.add(32);
        listInteger.add(35);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);
        listInteger.add(40);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("Size: "+listInteger.getSize());
        System.out.println("DEFAULT_CAPACITY: "+listInteger.getDEFAULT_CAPACITY());

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));

    }
}
