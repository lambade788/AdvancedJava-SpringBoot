package CollectionFramework.Day15;

import java.util.*;
/// Sorted order
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treemap = new TreeMap<>();

        treemap.put(10,"BMW");
        treemap.put(23,"TATA");
        treemap.put(30,"Suzuki");
        treemap.put(33,"HONDA");
        treemap.put(93,"TATA");
        treemap.put(44,"TATA");

        System.out.println(treemap);

        for(Map.Entry<Integer,String> element :treemap.entrySet()){
            System.out.println(element.getKey()+":"+ element.getValue());
        }

        System.out.println(treemap.firstKey());
    }
}
