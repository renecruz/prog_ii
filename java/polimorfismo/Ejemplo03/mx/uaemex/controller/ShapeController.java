package mx.uaemex.controller;

import mx.uaemex.shapes.Circle;
import mx.uaemex.shapes.Square;
import mx.uaemex.shapes.Triangle;
import mx.uaemex.shapes.Shape;

public class ShapeController
{
    private Shape circle1;
    private Shape circle2;    
    private Shape triangle1;
    private Shape triangle2;
    private Shape square1;
    private Shape square2;
    Shape shapes[];
    
    public ShapeController() {
        circle1 = new Circle();
        circle2 = new Circle();
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        square1 = new Square();
        square2 = new Square();
        shapes = new Shape[6];
        shapes[0] = circle1;
        shapes[1] = circle2;
        shapes[2] = triangle1;
        shapes[3] = triangle2;
        shapes[4] = square1;
        shapes[5] = square2;
    }
    
    public void drawShapes() {
        for (int i = 0; i < 6; i++) {
            shapes[i].drawShape();
        }
    }
}
