package mx.uaemex.controller;

import mx.uaemex.shapes.Square;
import mx.uaemex.shapes.Circle;

public class ShapeController
{
    public ShapeController() {
        Square s = new Square(23,45,"Azul",3);
        s.drawShape();
        s.calcArea();
        
        Circle c = new Circle(11,67,"Rojo",5);
        c.drawShape();
        c.calcArea();
    }
    
    public static void main(String args[]){
        new ShapeController();
    }
}
