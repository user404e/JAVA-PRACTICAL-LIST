public class StringMethods {
    public static void main(String[] args) {

    
        String s1 = "Hello";
        String s2 = "ajay,dev,kishan,vishwas";
        String s3;
        int num = 20;
        String names[];

        // chatAt method
        System.out.println("\nCHARAT METHOD : ");
        System.out.println(s1.charAt(1) + " is at index 1");
        // contains method
        System.out.println("\nCONTAINS METHOD : ");
        if(s1.contains("lo")){
            System.out.println(s1 + " Contains \"lo\"");
        }
        
        // length method
        System.out.println("\nLENGTH METHOD : ");
        System.out.println("Length of String " + s1 + " = " + s1.length());

        //split method
        System.out.println("\nSPLIT METHOD : ");
        names = s2.split(",");
        
        System.out.println("Names -");
        for (String name : names) {
            System.out.println(name);
        }

        //format method
        System.out.println("\nFORMAT METHOD : ");
        s3 = String.format("%s",num);
        System.out.println(s3);
    }
}
