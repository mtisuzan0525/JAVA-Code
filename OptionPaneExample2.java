
package javaswing;

import javax.swing.*;  
public class OptionPaneExample2 {  
JFrame f;  
OptionPaneExample2(){  
    f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name");      
}  
public static void main(String[] args) {  
    new OptionPaneExample2();  
}  
}  
