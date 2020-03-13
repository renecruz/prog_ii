package mx.uaemex.shapes;

public class Shape
{
    protected int x, y;
    protected String color;
    
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public void drawShape(){
        System.out.println("Dibujando figura");
    }
        
}
