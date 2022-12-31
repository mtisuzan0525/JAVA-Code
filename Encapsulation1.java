
package class_2;

public class Encapsulation1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test {

    public static void main(String[] args) {
//creating instance of the encapsulated class
        Encapsulation1 s = new Encapsulation1();
//setting value in the name member
        s.setName("vijay");
        System.out.println(s.getName());
    }
}
