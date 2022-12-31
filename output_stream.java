
package class_3;

import java.io.*;
public class output_stream {
   public static void main(String[] args) {
        try{ 
            FileOutputStream fout=new FileOutputStream("E:\\test_1.txt"); 
            String s="Welcome to City University."; 
            byte b[]=s.getBytes();
            fout.write(b); 
            fout.close(); 
            System.out.println("Finally success..."); 
        }
            catch(IOException e){
                System.out.println(e);
            } 
    }
}
