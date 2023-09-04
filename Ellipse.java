/**
This Ellipse.java class is a basic shape class wherein an Ellipse shape
is set up for visual drawing. This class implements the DrawingObject
interface and defines its draw(Graphics g2d) method to produce an ellipse.

@author Maria Charmane Rose E. Naciongayo
@version March 9, 2023
**/

/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.

I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.

If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/

import java.awt.*;
import java.awt.geom.*;

public class Ellipse extends UniversalStyles implements DrawingObject {
    
    double x1 = 0;
    double y1 = 0;
    double w = 0;
    double h = 0;

    double tx = 0;
    double ty = 0;
    double theta = 0;
    
    Color fillColor;
    Color strokeColor;
    BasicStroke stroke;

    /* This method is called by classes that have instantiated this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * an ellipse that is visible, given that this shape's fields are initialized prior.
     */
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double circle = new Ellipse2D.Double(x1,y1,w,h);
        g2d.translate(tx, ty);
        g2d.rotate(theta);
        g2d.setColor(fillColor);
        g2d.fill(circle);
        g2d.setColor(strokeColor);
        g2d.setStroke(stroke);
        g2d.draw(circle);
    }

    /* This is a mutator method to set up the Ellipse shape's tx and ty fields before calling
       the draw(Graphics g2d) method on this class. It mofidies the arguments
       passed through the translate(tx, ty) method called within draw(Graphics2D g2d)
       and replaces them with double x and double y respectively.
     */
    public void translate(double x, double y) {
        tx = x;
        ty = y;
    }

    /* This is a mutator method to set up the Ellipse shape's rotate field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the rotate(theta) method called within draw(Graphics2D g2d)
        and replaces it with double t.
     */
    public void rotate(double t) {
        theta = t;
    }

    /* This is a mutator method to set up the Ellipse shape's fillColor field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setColor(fillColor) method called within draw(Graphics2D g2d)
        and replaces it with Color c.
     */
    public void setFillColor(Color c) {
        fillColor = c;
    }

    /* This is a mutator method to set up the Ellipse shape's strokeColor field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setColor(strokeColor) method called within draw(Graphics2D g2d)
        and replaces it with Color c.
     */
    public void setStrokeColor(Color c) {
        strokeColor = c;
    }

    /* This is a mutator method to set up the Ellipse shape's stroke field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setStroke(stroke) method called within draw(Graphics2D g2d)
        and replaces it with BasicStroke s.
     */
    public void setStroke(BasicStroke s) {
        stroke = s;
    }

    /* This is a mutator method to set up the Ellipse shape's s field before calling the
        draw(Graphicsg2d) method on this class. Essentially, this method resizes the
        circle and passes through double a as the circle's size. 
     */
    public void resize(double a, double b) {
        w = a;
        h = b;
    }
}
