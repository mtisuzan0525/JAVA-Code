
package class_3;
import java.io.*;

public class Byet_Arra_output {
    public static void main(String[]arg) throws FileNotFoundException, IOException{
        FileOutputStream fout1=new FileOutputStream("E:\\f1.txt"); 
        FileOutputStream fout2=new FileOutputStream("E:\\f2.txt"); 

        ByteArrayOutputStream bout=new ByteArrayOutputStream(); 
        bout.write(65); 
        bout.writeTo(fout1); 
        bout.writeTo(fout2); 

        bout.flush(); 
        bout.close();
        System.out.println("Well Done! Success..."); 
    
    }
}
