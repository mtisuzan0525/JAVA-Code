
package class_3;

import java.io.*;
public class Buffer_outpput {
    public static void main(String args[])throws Exception{
            FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Id: 181472030, Name: Md. Tarikul Islam Suzan, CGPA: 2.91, Address: Manikgong.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
            System.out.println("success");
    }
}
