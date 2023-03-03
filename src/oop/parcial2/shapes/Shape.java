package oop.parcial2.shapes;

public class Shape {
    protected String name;
    protected int SidesCount;

    public Shape(String name){
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){

        return 0;
    }
    public int getSidesCount(){
        return SidesCount;
    }
}
