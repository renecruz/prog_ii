package mx.uaemex.shapes;


public class Triangle extends Shape
{
    public String triangleType;
    
    public void printType(){
        System.out.println("Tipo: " + triangleType);
    }
    
    public void drawShape() {
        System.out.println("Dibujando triángulo");
    }
}
