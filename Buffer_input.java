
package class_3;
import java.io.*;

public class Buffer_input {
    public static void main(String[]arg){
        try{
            FileInputStream fin=new FileInputStream("E:\\testout.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }
                catch(Exception e){
                    System.out.println(e);
                }
    }
}
