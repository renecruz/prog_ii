package mx.uaemex.main;

import mx.uaemex.controller.ShapeController;

public class DrawShapesMain
{
    public static void main(String args[]) {
        ShapeController shapeController = new ShapeController();
        shapeController.drawCircles();
        shapeController.drawTriangles();
        shapeController.drawSquares();
    }
}
