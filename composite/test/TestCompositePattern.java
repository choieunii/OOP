/*
* 컴퓨터공학과 2018112021 최은지
* */
package composite.test;


import composite.composite.Circle;
import composite.composite.Drawing;
import composite.composite.Shape;
import composite.composite.Triangle;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
