package map;

import java.util.*;

public class TreeSetExa
{
    public static void main(String[] args) {
        TreeSet <String> treeSet = new TreeSet<>();
        treeSet.add("ilyas");
        treeSet.add("nasiya");
        treeSet.add("idris");

        // Duplicates elements are not allowed
        treeSet.add("nasiya");

        //Traversing elements
        Iterator<String> itr=treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
