package task2;
import java.util.*;

public class T2Demo {
    public static void main(String args[]) {
        Map<String, Integer> mp = new HashMap<>();  // 无序，不支持线程同步
        Set<Integer> set = new HashSet<>(); //线程不安全
        List<Integer> list = new ArrayList<>();  // 底层是数组，查询快，修改慢，线程不安全，Vector线程安全但效率会慢些
        list.add(100);
        list.add(10);
        list.add(1000);
        list.add(1);
        mp.put("const", 1);
        mp.put("end", 21);
        mp.put("if", 27);
        mp.put("then", 25);
        mp.put("while", 23);
        mp.put("end", 20);
        mp.put(null, 100);
        set.add(10);
        set.add(100);
        set.add(1);
        set.add(1);


        for(String str : mp.keySet()) {
            System.out.println("key:" + str + "  value:" + mp.get(str));
        }
        int cnt = 0;
        for(Integer i : set) { //输出是无序的
            cnt += 1;
            System.out.println("第" + cnt + "个数为：" + i);
        }
        cnt = 0;
        for(Integer i : list){
            cnt += 1;
            System.out.println("第" + cnt + "个数为：" + i);
        }
        Iterator<String> mp_it = mp.keySet().iterator();    // 获取键值的迭代器
      //遍历器迭代
        while(mp_it.hasNext()) {
            System.out.println(mp_it.next());
        }
        Iterator<Integer> list_it = list.listIterator();
        while(list_it.hasNext()) {
            System.out.println(list_it.next());
        }
        Iterator<Integer> set_it = set.iterator();
        while(set_it.hasNext()) {
            System.out.println(set_it.next());
        }
    // 删改
        // list : 100 10 1000 1 会记录插入的顺序
        list.remove(0);
        list.set(2, -1);
        System.out.println(list);
        //set : 10 100 1
        set.add(10000);
        set.remove(1);
        System.out.println(set);
        // mp :
        mp.remove("const");
        System.out.println(mp.remove("const", 1));
        System.out.println(mp);
    }

}
