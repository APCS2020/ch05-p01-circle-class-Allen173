public class Circle{
    private String color = "red";
    private double radius = 1.0;

    public String getColor(){
        return colcor;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double r) {
        this.radius = r;
    }
    public Circle(){
        color = "red";
        radius = 1.0;
    }
    public Circle(String color, double r){
        this.color =color;
        this.radius = r;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}