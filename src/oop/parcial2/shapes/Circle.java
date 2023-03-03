package oop.parcial2.shapes;

public class Circle extends Shape{
    private double radio;
    public Circle(){
        super("Círculo");
    }
    public Circle(double radio){
        this();
        this.radio=radio;
        SidesCount=1;
    }
    public double getArea(){
        return Math.PI*Math.pow(radio,2);
    }
    public double getPerimeter(){
        return Math.PI*radio*2;
    }
    public String toString(){
        return "○";
    }

}
