package bai_tap.bai_tap_1;


import java.util.ArrayList;
import java.util.Date;

public class TestArrList {
    public static void main(String[] args) {
//        MyList1<Integer> arr = new MyList1<>();
//        arr.add(6);
//        arr.add(52);
//        arr.add(54);
//        arr.add(555);
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println("element " + i +": " + arr.get(i));
//        }
//
//        arr.add(3, 1);
//        System.out.println("Sau add index");
//        System.out.println(arr.size());
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println("element " + i +": " + arr.get(i));
//        }
//
//        arr.remove(2);
//        System.out.println("Sau remove index");
//        System.out.println(arr.size());
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println("element " + i +": " + arr.get(i));
//        }
//
//        System.out.println(arr.contains(555));
//        System.out.println(arr.indexOf(5));
//        arr.clear();
//
//        System.out.println("Sau clear");
//        System.out.println(arr.size());
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println("element " + i +": " + arr.get(i));
//        }


        MyList1<Integer> arrayList = new MyList1<>();
        MyList1<Integer> arrayList1 = new MyList1<>();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList1.add(4);
        arrayList1.add(65);
        arrayList1.add(53);


        System.out.println(arrayList1.addAll(arrayList));
        System.out.println(arrayList1.size());
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println("element " + i +": " + arrayList1.get(i));
        }

    }
}
