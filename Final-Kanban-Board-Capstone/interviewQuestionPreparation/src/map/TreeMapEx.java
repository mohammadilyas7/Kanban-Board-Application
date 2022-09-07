package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(5,"zipcode");
        treeMap.put(1,"Ilyas");
        treeMap.put(2,"nasiya");
        treeMap.put(3,null);
        treeMap.put(8,"idris");
//        treeMap.put(null,"idris");  //null key not allowed

        System.out.println(treeMap);

        for (Map.Entry m: treeMap.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
    }
}