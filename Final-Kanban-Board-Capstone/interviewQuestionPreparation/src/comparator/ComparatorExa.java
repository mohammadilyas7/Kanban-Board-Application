package comparator;

import java.util.Comparator;

public class ComparatorExa implements Comparator<Student> {

    public int compare(Student o1,Student o2){
        if (o1.getMark() == o2.getMark()){
            return 0;
        } else if (o1.getMark() > o2.getMark()) {
            return 1;
        }else {
            return -1;
        }
    }
}