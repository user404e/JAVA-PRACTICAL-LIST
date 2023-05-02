public class MaxOf3 {
    
    public static void main(String args[]){

        int num1 = 2220;
        int num2 = 563;
        int num3 = 1030;

        int max = ( (num1 > num2) && (num1 > num3) ) ? num1 : ( (num2 > num1) && (num2 > num3) ) ? num2 : num3;

        System.out.println("MAX = " + max);
        
    }
}
