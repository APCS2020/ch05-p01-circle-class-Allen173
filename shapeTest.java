import java.util.ArrayList;

public class shapeTest{
    public static double getArea(Circle[] clist){
        double sum = 0;
        for(int i = 0; i < clist.length; i ++){
            sum += clist[i].getArea();
        }
        return sum;
        
    }
    public static double getArea(ArrayList<Rectangle> clist){
        double sum = 0;
        for(Rectangle r : clist){
            sum += r.getArea();
        }
        return sum;
    }
    public static double getArea(Triangle[][] clist){
        double sum = 0;
        for(int r = 0; r < clist.length; r++){
            for(int c = 0; c < clist[i].length; c++){
                sum += xlist[r][c].getArea();
            }
        }
        return sum;
    }
    public static void main(String[] args){}
}
