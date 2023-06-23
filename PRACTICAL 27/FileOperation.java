import java.io.*;

public class FileOperation {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            
            fw.write("Hii There ,\nHello World");
            fw.close();

            FileReader fr = new FileReader("data.txt");
            int d = 0;
            while((d = fr.read())!=-1){
                System.out.print((char)d);
            }
            
        } catch (Exception e) {
            
        }
    }
}
