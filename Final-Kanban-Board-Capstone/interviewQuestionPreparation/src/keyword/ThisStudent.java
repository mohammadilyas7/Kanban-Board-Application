package keyword;

public class ThisStudent {
    int mark;
    String name;

    void setValue(int mark){
        this.mark = mark;   // this keyword refer to the instance vareible
    }

    void show(){
        System.out.println(mark);
    }

    public static void main(String[] args) {
        ThisStudent thisStudent = new ThisStudent();
        thisStudent.setValue(10);
        thisStudent.show();
    }
}