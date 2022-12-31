
package class_2;

class Vehiclee{
    void run(){
        System.out.println("Vehicle is running");
    }
}
public class method_overriding extends Vehiclee {
    public static void main(String[]arg){
        method_overriding obj = new method_overriding();
        obj.run();
    }
}
