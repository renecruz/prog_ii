package mx.uaemex.shapes;


public class Triangle extends Shape
{
    public String triangleType;
    
    public void printType(){
        System.out.println("Tipo: " + triangleType);
    }
    
    @Override
    public void drawShape() {
        System.out.println("Dibujando triángulo");
    }
}
