public class Shapes {
    private String color;
    private String name;
    
    public Shapes(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public String getName(){
        return name;
    }
    
    public String getColor(){
        return color;
    }
    
    public double area(){
        return -1;
    }
    
    public String toString(){
        return color + " shaped " + name;
    }
    
    
}
