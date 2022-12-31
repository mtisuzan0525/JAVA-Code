
package class_2;

/**
 *
 * @author TARIKUL
 */
public class protected_access_modifier {
    protected void msg(){
        System.out.println("Hello");
    }  
    
}

class protected_access_modifier_new extends protected_access_modifier{  
  public static void main(String args[]){  
   protected_access_modifier_new obj = new protected_access_modifier_new();  
   obj.msg();  
  }  
}  
