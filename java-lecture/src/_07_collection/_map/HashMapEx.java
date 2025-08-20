package _07_collection._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        // 객체 저장
        map.put(1001, "물짱이");
        map.put(1002, "피카츄");
        map.put(1003, "꼬북이");
        map.put(1004, "파이리");
        map.put(1004, "리자몽"); // 수정
        System.out.println(map);
        
        // 요소의 개수
        System.out.println("map 의 데이터 개수: " + map.size());
        
        // key 로 접근
        int key = 1002;
        String value = map.get(key);
        System.out.printf("%d 번 포켓몬의 이름은 %s", key, value).println();
        
        // 순회
        System.out.println("=== map 순회(1) entrySet() 과 for 이용 ===");
        // entry는 키와 값의 쌍이고 Set은 엔트리로 이루어져 있다
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        // key=value 엔트리를 set 에 저장한 것
        System.out.println(entrySet);
        // [1001=물짱이, 1002=피카츄, 1003=꼬북이, 1004=리자몽]

        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + "번 포켓몬: " + entry.getValue());
        }

        System.out.println("=== map 순회(2) entrySet() 과 Iterator 객체 이용 ===");
        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<Integer, String> studentEntry = entryIterator.next();
            // studentEntry: 1001=물짱이
            Integer entryKey = studentEntry.getKey();
            String entryValue = studentEntry.getValue();

            System.out.println(entryKey + " + " + entryValue);
        }

        System.out.println("=== map 순회(3) keySet() 과 for 사용 ===");
        Set<Integer> keySet = map.keySet(); // [1001, 1002, 1003, 1004]  key만 사용하니까 Integer
        System.out.println(keySet);

        for(Integer k : keySet) {
            System.out.printf("Key: %d, Value: %s", k, map.get(k)).println(); // map.keySet()의 map
        }
        
        // map 요소 삭제 (map 내의 entry 삭제)
        String deleteValue = map.remove(1003);
        System.out.println("삭제되는 value: " + deleteValue);
        System.out.println("삭제 후 map: " + map);
    }
}
