package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExa {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ilyas");
        hashMap.put(2, "nasiya");
        hashMap.put(2, "nasiya");    //trying dublicate key not allowd
        hashMap.put(3, "zipcode");
        hashMap.put(4, "nasiya");
        hashMap.put(null, "kasam");
//        hashMap.put(null,"ok");     //at leaset one null key

        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
    }
}
