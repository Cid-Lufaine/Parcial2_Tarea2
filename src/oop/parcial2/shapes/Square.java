package oop.parcial2.shapes;

public class Square extends Shape {
    private double side;

    public Square(){
        super("Cuadrado");
    }

    public Square(double side){
        this();
        this.side=side;
        SidesCount=4;
    }

    public double getArea(){

        return side*side;
    }
    public double getPerimeter(){

        return side*4;
    }
}
