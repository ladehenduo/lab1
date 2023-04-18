package task2.Generic;

import java.util.*;

// 一个泛型类，只接受数值类型的泛型
public class Box< T extends Number> {
    public List<T> list;
    public Map<String, T> map;
    public Set<T> set;

    public Box() {
        list = new ArrayList<T>();
        map = new HashMap<String, T>();
        set = new HashSet<T>();
    }

    public boolean addList(T t) {
        return list.add(t);
    }
    public boolean putMap(String s, T t){
        T v = map.put(s, t);
        return v == t;
    }
    public boolean addSet(T t){
        return set.add(t);
    }
    public void showList() {
        System.out.print("List: ");
        System.out.println(list);
    }
    public void showMap() {
        System.out.print("Map: ");
        System.out.println(map);
    }
    public void showSet() {
        System.out.print("Set: ");
        System.out.println(set);
    }
}
