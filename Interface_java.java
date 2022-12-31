
package class_2;


interface Interface_java {
    void print();
    
}

class A6 implements Interface_java{
public void print(){System.out.println("Hello");}
public static void main(String args[]){
A6 obj = new A6();
obj.print();
}
}