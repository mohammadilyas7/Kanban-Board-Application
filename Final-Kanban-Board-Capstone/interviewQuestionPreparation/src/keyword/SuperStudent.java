package keyword;

public class SuperStudent {
     int i =10;
}

class Super extends SuperStudent{
    int i=20;
    void display(int i){
        System.out.println(this.i);
        System.out.println(super.i);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Super superOb = new Super();
        superOb.display(20);

    }

}