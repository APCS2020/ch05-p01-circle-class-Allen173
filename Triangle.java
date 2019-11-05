public class Triangle{
    private double side;
    private double height;

    
    public double getHeight() {
        return height;
    }
    public double getSide() {
        return side;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public Triangle(double s, double h){
        this.side = s;
        this.height =h;
    }
    public double getArea(){
        return height * side / 2; 
    }
}