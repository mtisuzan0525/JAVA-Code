
package class_3;

import java.io.FileInputStream;
public class Input_strem {
    public static void main(String[]arg){
        try{
            FileInputStream fin=new FileInputStream("E:\\testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
            System.out.print((char)i);
        }
            fin.close();
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
