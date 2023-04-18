package task2.Generic;

import java.util.*;

public class GenericTest {
    // 一个泛型方法
    public static <E> void printArr(E[] arr) {
        for(E e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    // 待填充类型
    public static void printArr(List<?> arr) {
        System.out.println(arr.get(0).getClass().getName() + "List: " + arr);
    }

    public static void main(String args[]) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Character[] crr = {'a', 'b', 'c', 'd', 'e'};
        printArr(arr);
        printArr(crr);

        Box<Integer> box = new Box<>();
        box.addList(10);
        box.addList(100);
        box.addList(1);
        box.addList(1000);
        box.addList(-1);
        box.showList();

        box.addSet(10);
        box.addSet(100);
        box.addSet(10);
        box.addSet(100);
        box.addSet(-1);
        box.showSet();

        box.putMap("const",1);
        box.putMap("end",2);
        box.putMap("if",3);
        box.putMap("then",4);
        box.putMap("null",5);
        box.putMap("const", 2);
        box.showMap();

        printArr(box.list);
        List<Double> dlist = new ArrayList<>();;
        dlist.add(1.11111);
        dlist.add(2.736);
        dlist.add(1.414);
        dlist.add(3.1415926263);
        dlist.add(1.23456789);
        printArr(dlist);

        // 工具类Collections使用
        Collections.sort(dlist);
        printArr(dlist);
        Collections.fill(dlist, 1.010101);
        printArr(dlist);
        // 工具类 Array 使用
        List<Integer> ll = Arrays.asList(arr);
        List<Character> cc = Arrays.asList(crr);
        printArr(ll);
        printArr(cc);
    }
}
