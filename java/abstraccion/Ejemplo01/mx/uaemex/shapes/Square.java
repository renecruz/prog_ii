package mx.uaemex.shapes;

public class Square extends Shape implements Calculable
{
    private int lado;
    
    public Square(int x, int y, String color, int lado) {
        super(x,y,color);
        this.lado = lado;
    }

    public void calcArea(){
        System.out.println("Area = " + 
                            (lado * lado ) );
                            
    }
}
