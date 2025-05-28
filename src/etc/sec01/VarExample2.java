package etc.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VarExample2 {
    public static void main(String[] args) {
        method1();
        method2();
    }


    private static void method1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    private static void method2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);

        var entrySet = map.entrySet();
        var entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }


}
