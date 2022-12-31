
package class_2;
class animaal{
    void eat(){
        System.out.println("eating.........");
    }
}
class dog extends animaal{
    void bark(){
        System.out.println("barking.........");
    }
}

class babydog extends dog{
    void weep(){
        System.out.println("weeping.........");
    }
}

public class multilevel_inheri {
    
    public static void main(String[]arg){
        babydog d=new babydog();
        d.weep();
        d.bark();
        d.eat();
        
    }
    
}
