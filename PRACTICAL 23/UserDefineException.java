import java.util.Scanner;

class DivideByZero extends Exception{
    public DivideByZero(String message){
        System.out.println(message);
    }
}

public class UserDefineException{
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nEnter 1st Number : ");
            int a = scan.nextInt();

            System.out.print("\nEnter 2nd Number : ");
            int b = scan.nextInt();

            if(b == 0){
                throw new DivideByZero("\nCannot Divide By Zero");
            }
            else{
                System.out.println("\n" + a/b);
            }
        } catch (DivideByZero e) {
           System.out.println("Message = " + e);
        }
    }
}