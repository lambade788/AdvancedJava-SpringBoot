package CollectionFramework.Day15;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(10,"BMW");
        lhm.put(23,"TATA");
        lhm.put(30,"Suzuki");
        lhm.put(33,"HONDA");
        lhm.put(93,"TATA");

        for(Map.Entry<Integer,String> element : lhm.entrySet()){
            Integer key = element.getKey();
            String value = element.getValue();

            System.out.println(key + ":"+value);
        }

        System.out.println(lhm.get(23));

        System.out.println(lhm);

//        lhm.clear();

        System.out.println(lhm);


    }
}
