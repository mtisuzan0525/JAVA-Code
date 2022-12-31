
package class_2;

abstract class Bike{
abstract void run();
}


public class abstraction1 extends Bike{
    
    void run()
{
    System.out.println("running safely");
}
    
    public static void main(String[] args) {
        Bike obj = new abstraction1();
        obj.run();
    }
}
