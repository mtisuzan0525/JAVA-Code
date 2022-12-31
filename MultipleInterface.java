
package class_2;
interface Printable{
    void print();
}

interface Showable{
    void show();
}
public class MultipleInterface implements Printable,Showable {
    public void print()
    {
        System.out.println("Hellow");
    }
    
    public void show()
    {
        System.out.println("Welcome");
    }
    
    public static void main(String[] args) {
        MultipleInterface obj=new MultipleInterface();
        obj.print();
        obj.show();
    }
}
