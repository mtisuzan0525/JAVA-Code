
package class_2;

class Animall{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animall{
    void bark(){
        System.out.println("barking......");
    }
}

public class single_inheri{
    public static void main(String[]arg){
       Dog d=new Dog();
       d.bark();
       d.eat();
    }
        
    
}
