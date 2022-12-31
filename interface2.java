package class_2;

interface Drawable {

    void draw();
}

class Rectangles implements Drawable {

    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circles implements Drawable {

    public void draw() {
        System.out.println("drawing circle");
    }
}

class Interface2 {

    public static void main(String args[]) {
        Drawable d = new Circles();
        d.draw();
    }
}
