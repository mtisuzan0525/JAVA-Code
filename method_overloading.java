
package class_2;

class adderr{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}
public class method_overloading {
    public static void main(String[]arg){
        System.out.println(adderr.add(11,11));
        System.out.println(adderr.add(12.3,12.6));
    }
    
}
