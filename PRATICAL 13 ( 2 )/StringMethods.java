public class StringMethods {
    public static void main(String[] args) {

    
        String s1 = "Hello World";
        String nums = "102030405";
        int n = 1300;
        String numbers[];

        System.out.println(s1.charAt(4));
        
        System.out.println(s1.contains(" Wo"));

        System.out.println(String.format("%d",n));
        
        System.out.println("Length = " + s1.length());
    
        numbers = nums.split("0");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}