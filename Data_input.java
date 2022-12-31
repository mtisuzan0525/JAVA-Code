
package class_3;

import java.io.*;
public class Data_input {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileInputStream input = new FileInputStream("E:\\t.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
        char s = (char) bt;
        System.out.print(s+"-");
        }
    }
}
