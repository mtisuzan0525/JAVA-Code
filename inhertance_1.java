
package class_2;

class Employee{
float salary=40000;
}

public class inhertance_1 extends Employee {
    int bonus=10000;
    public static void main(String[]arg){
        inhertance_1 i=new inhertance_1();
        System.out.println("inhertance_1 is: "+i.salary);
        System.out.println("Bonurs of inhertance_1 is: "+i.bonus);
        
    }
    
}
