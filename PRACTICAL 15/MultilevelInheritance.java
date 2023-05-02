class demo1{
    demo1(){
        System.out.println("Demo1");
    }
    int num1 = 30;
}
class demo2 extends demo1{
    demo2(){
        System.out.println("Demo2");
    }
    int num2 = 40;
    int num3 = num1 + num2;
}
class demo3 extends demo2{
    demo3(){
        System.out.println("Demo3");
    }
    int num4 = 50;
    int ans = num3 + num4;

    void printdata(){
        System.out.println(ans);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        demo3 d3 = new demo3();
        d3.printdata();
    }
}