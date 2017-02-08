package prototype;

public class Square extends Shape {

    public Square(){
        type = "Square";
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