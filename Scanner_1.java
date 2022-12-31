
package class_3;

import java.util.*;
public class Scanner_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter your name: "); 
        String name = in.nextLine(); 
        System.out.println("Name is: " + name); 
        in.close();
    }
}
