package prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Long time = System.currentTimeMillis();
        Shape shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();
        System.out.println(System.currentTimeMillis()-time);

        time = System.currentTimeMillis();
        Shape shape1 = ShapeCache.getShape("1");
        shape1.draw();
        shape1 = ShapeCache.getShape("2");
        shape1.draw();
        System.out.println(System.currentTimeMillis()-time);
    }
}