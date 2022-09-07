package map;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam
{
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("one");     //contain unique element HashSet ASCII value checking

        Iterator<String>iterator = hashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}