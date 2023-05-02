class A{
    String s1 = "Hello";
}

class B extends A{
    String s2 = s1 + " World";

    void printdata(){
        System.out.println(s2);
    }
}
public class SingleInheritance{
    public static void main(String[] args) {
        B b1 = new B();
        b1.printdata();
    }
}