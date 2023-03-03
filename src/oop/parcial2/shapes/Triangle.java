package oop.parcial2.shapes;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(){
        super("Triángulo");
    }
    public Triangle(double base,double height){
        this();
        this.base=base;
        this.height=height;
        SidesCount=3;
    }
    public double getArea(){

        return (base*height)/2;
    }
    public double getPerimeter(){
        double hipotenusa, perimetro;
        //Triángulo Rectángulo
        hipotenusa= Math.hypot (base, height);
        perimetro = hipotenusa+base+height;
        //Triángulo isoceles
        //hipotenusa= Math.hypot (base/2, height);;
        //perimetro = base + (hipotenusa*2);
        //Triángulo escaleno
        // es necesario conocer mas valores ya sean los lados o los angulos entre ellos
        return perimetro;
    }

}
