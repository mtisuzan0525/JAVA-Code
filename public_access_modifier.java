
package class_2;

public class public_access_modifier {
    public void msg(){
        System.out.println("Hello");
    }  
    
}

class public_access_modifier_new{  
  public static void main(String args[]){  
   public_access_modifier obj = new public_access_modifier();  
   obj.msg();  
  }  
}