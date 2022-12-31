
package class_3;
import java.io.FileOutputStream;
public class Error_1 {
    public static void main(String[]arg){
        try{
           FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
           String s="Welcome";
           byte b[]=s.getBytes();//String convert
           fout.write(b);
           fout.close();
            System.out.println("Success");
        }
        catch(Exception e){
                System.out.println(e);
    }       
}
}
