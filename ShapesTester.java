public class ShapesTester
{
    public static void main(String[] args)
    {
        Shapes shape1 = new Shapes("Block", "Pink");
        System.out.println(shape1.toString());
        
        Shapes shape2 = new Triangle("Blue", 5, 7, 3);
        System.out.println(shape2.toString());
        
        Shapes shape3 = new Star("Yellow", 5, 10, 5);
        System.out.println(shape3.toString());
    }
}
