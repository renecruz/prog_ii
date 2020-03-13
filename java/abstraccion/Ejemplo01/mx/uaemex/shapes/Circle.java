package mx.uaemex.shapes;

import java.awt.event.*;

public class Circle extends Shape implements Calculable, MouseListener
{
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    
    private int r;
    
    public Circle(int x, int y, String color, int r) {
        super(x,y,color);
        this.r = r;        
    }
    
    public void calcArea() {
        float area = (3.1416f * (r*r) );
        System.out.println("Area = " + area );
    }
}
