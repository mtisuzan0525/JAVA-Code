
package class_2;
class Adder{
    int add(int a,int b){return a+b;}
    int add(int a,int b,int c){return a+b+c;}
}

public class methodOverloading2 {
    public static void main(String[] args) {
        Adder d=new Adder();
        
        System.out.println(d.add(11,11));
        System.out.println(d.add(11,11,11));
    }
    
}
