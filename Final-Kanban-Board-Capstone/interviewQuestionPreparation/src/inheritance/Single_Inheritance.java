package inheritance;

public class Single_Inheritance {
    void eat(){
        System.out.println("eating mango");
    }
}

class Single extends Single_Inheritance{

    public static void main(String[] args) {
        Single single = new Single();
        single.eat();
    }


}