package mx.uaemex.controller;

import mx.uaemex.shapes.Circle;
import mx.uaemex.shapes.Square;
import mx.uaemex.shapes.Triangle;
import mx.uaemex.shapes.Shape;

public class ShapeController
{
   
    Shape shapes[];
    
    public ShapeController() {       
        shapes = new Shape[6];
        shapes[0] = new Circle();
        shapes[1] = new Circle();
        shapes[2] = new Triangle();
        shapes[3] = new Triangle();
        shapes[4] = new Square();
        shapes[5] = new Square();
    }
    
    public void drawShapes() {
        for (int i = 0; i < 6; i++) {
            shapes[i].drawShape();
        }
    }
}
