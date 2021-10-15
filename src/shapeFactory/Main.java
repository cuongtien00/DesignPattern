package shapeFactory;

public class Main {
    public static void main(String[] args) {
        FactoryShape factoryShape = new FactoryShape();

        Shape s1 = factoryShape.getShape("Square");
        System.out.println("Drawing s1 " + s1.draw());

        Shape s2 = factoryShape.getShape("Rectangle");
        System.out.println("Drawing s2 " + s2.draw());

        Shape s3 = factoryShape.getShape("Circle");
        System.out.println("Drawing s3 " + s3.draw());
    }
}
