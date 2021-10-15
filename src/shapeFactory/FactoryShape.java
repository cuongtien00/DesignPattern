package shapeFactory;

public class FactoryShape {
    public Shape getShape(String type){
        if("Square".equals(type)){
            return new Square();
        }
        else if("Circle".equals(type)){
            return new Circle();
        }
        else{
            return new Rectangle();
        }
    }

}
