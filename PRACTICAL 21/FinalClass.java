final class Demo1{
    int a = 10;
}

/*  generates error because final class cant be extended

class Demo2 extends Demo1{
    
} 
*/

public class FinalClass {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        System.out.println(d1.a);
    }
}
