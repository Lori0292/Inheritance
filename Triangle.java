public class Triangle extends Shapes {
    private double enlarge;
    private double height;
    private double base;
    
    public Triangle(String color, double height,double base, double enlarge){
        super("Triangle", color);
        this.enlarge = enlarge;
        this.base = base;
        this.height = height;
    }
    
    public double area(){
        return (base * height)/2 * enlarge;
    }
    
    
    public String toString(){
        return super.getColor() +  " Triangle with area of " + area() + " after being enlarged by " + enlarge; 
    }
}
