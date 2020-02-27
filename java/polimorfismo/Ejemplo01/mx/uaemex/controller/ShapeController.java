package mx.uaemex.controller;

import mx.uaemex.shapes.Circle;
import mx.uaemex.shapes.Square;
import mx.uaemex.shapes.Triangle;

public class ShapeController
{
    public Circle circle1;
    public Circle circle2;    
    public Triangle triangle1;
    public Triangle triangle2;
    public Square square1;
    public Square square2;
    
    public ShapeController() {
        circle1 = new Circle();
        circle2 = new Circle();
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        square1 = new Square();
        square2 = new Square();
    }
    
    public void drawCircles() {
        circle1.drawShape();
        circle2.drawShape();
    }
    
    public void drawTriangles() {
        triangle1.drawShape();
        triangle2.drawShape();        
    }
    
    public void drawSquares() {
        square1.drawShape();
        square2.drawShape();
    }
}
