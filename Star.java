import java.lang.Math;
public class Star extends Shapes {
    private int numPoints;
    private double outerRadius;
    private double innerRadius;
    
    public Star(String color,int numPoints, double outerRadius, double innerRadius){
        super("Star",color);
        this.numPoints = numPoints;
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }
    
    public double area(){
        double angle = 2 * Math.PI/numPoints;
        double outerA = (numPoints * Math.sin(angle))/2 * Math.pow(outerRadius, 2);
        double innerA = (numPoints * Math.sin(angle))/2 * Math.pow(innerRadius, 2);
        return Math.round((outerA - innerA)*100)/100.0;
    }
    
    public String toString(){
        return super.getColor() + " Star with " + numPoints + " points and an area of " + area();
    }
    
    
}
