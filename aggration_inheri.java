
package class_2;
class Operation{
    int square(int n){
    return n*n;
    }   
}

class Circle{
    Operation op;//aggregation
    double pi=3.14;

    double area(int radius){
    op=new Operation();
    int rsquare=op.square(radius);
    return pi*rsquare;
    }
}

public class aggration_inheri {
    public static void main(String []arg){
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(result);
    }
    
}
