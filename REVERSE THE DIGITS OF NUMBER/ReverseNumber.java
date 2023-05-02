public class ReverseNumber {
    
    public static void main(String args[]){

        int num = 5683;
        int re = 0 , rm;

        while( num > 0 ){
            
            rm = num % 10;
            
            num = num/10;
            re = (re*10) + rm;

        }

        System.out.println("REVERSED NUMBER = " + re);
    }
}
