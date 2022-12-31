
package class_2;

class employee {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
}

public class Encapsulation {
    public static void main(String[] args) {
        employee e=new employee();
        e.setName("Emon");
        System.out.println("The name is: "+e.getName());
        
    }
}
