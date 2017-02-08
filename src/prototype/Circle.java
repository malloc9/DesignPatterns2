package prototype;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
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