package comparator;

import java.util.ArrayList;
import java.util.Collections;
public class Student
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

    public Student(String nname, int mark) {
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
        ArrayList<Student> ob = new ArrayList<>();
        ob.add(new Student("ilyas",99));
        ob.add(new Student("kasam",88));
        ob.add(new Student("nasiya",47));
        ob.add(new Student("babu",99));

        Collections.sort(ob,new ComparatorExa());


        for (Student student: ob){
            System.out.println(student);
        }

        ob.stream().filter(p->p.getNname().equals("ilyas"));

    }




}


































//    List<Student> studentList = ob.stream().sorted((p1, p2)->p1.getMark().compareTo(p2.getMark())).collect(Collectors.toList());