public class PrimeNumber {
    
    public static void main(String args[]) {

        int n = 5;
        int count = 1 , i = 2;
        
        while (count <= n) {
            int f = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = 0;
                    break;
                }
            }
            if (f == 1) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        
    }
        
}
