
package class_2;

public class public_modifier {

    protected void msg() {
        System.out.println("Hello");
    }
}

class B extends public_modifier {

    public static void main(String args[]) {
        B obj = new B();
        obj.msg();
    }
}
