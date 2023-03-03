package oop.parcial2.shapes;

public class Rectangle extends Shape{

    private double base;
    private double height;

    public Rectangle(){
        super("Rectángulo");
    }

    public Rectangle(double base,double height){
        this();
        this.base=base;
        this.height=height;
        SidesCount=4;
    }

    public double getArea(){
        return base*height;
    }
    public double getPerimeter(){
        return (2*base) + (2*height);
    }

}
