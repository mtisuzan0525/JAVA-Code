
package class_2;
class aanimal{
    void eat(){
        System.out.println("eating....");
    }
}

class dogg extends aanimal{
    void bark(){
        System.out.println("barking");
    } 
}

class Cat extends aanimal{
    void meow(){
        System.out.println("meowing.....");
    }
}
public class hierarchical_inheri {
    public static void main(String []arg){
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
    
}
