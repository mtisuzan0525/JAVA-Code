
package class_3;

import java.io.*;
public class Data_output {
    public static void main(String[] args)  throws IOException { 
       
        FileOutputStream file = new FileOutputStream ("E:\\testout.txt"); 
        DataOutputStream data = new DataOutputStream(file); 
        data.writeInt(65); 
        data.flush(); 
        data.close(); 
        System.out.println("Succcess...");
    }
}
