class demo1{
    int num = 30;
}
class demo2 extends demo1{
    void printdata(){
        System.out.println(num);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        demo2 d2 = new demo2();
        d2.printdata();
    }
}
