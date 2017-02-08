package prototype;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw() {
        System.out.println("Inside " + type + "::draw() method.");
    }
}