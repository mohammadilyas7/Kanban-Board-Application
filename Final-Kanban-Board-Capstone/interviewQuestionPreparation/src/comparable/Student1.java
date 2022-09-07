package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student1
{
    String nname ;
    int mark;

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student1(String nname, int mark) {
        this.nname = nname;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nname='" + nname + '\'' +
                ", mark=" + mark +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Student1> ob = new ArrayList<>();
        ob.add(new Student1("ilyas",99));
        ob.add(new Student1("kasam",88));
        ob.add(new Student1("nasiya",47));
        ob.add(new Student1("babu",99));

        Collections.sort(ob,(p, p1)->{
            return p.compareTo(p1);
        });

        for (Student1 student1:ob){
            System.out.println(student1);
        }

    }

    private int compareTo(Student1 p1) {
        if (mark == p1.getMark()){
            return 0;
        } else if (mark > p1.getMark()) {
            return 1;
        }else {
            return -1;
        }
    }


}