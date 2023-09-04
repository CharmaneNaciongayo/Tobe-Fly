/**
This Triangle.java class is a basic shape class wherein a triangle shape
is set up for visual drawing. This class implements the DrawingObject
interface and defines its draw(Graphics g2d) method to produce a triangle.

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

public class Triangle extends UniversalStyles implements DrawingObject{

    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    double x3 = 0;
    double y3 = 0;

    double tx = 0;
    double ty = 0;
    double theta = 0;
    
    Color fillColor;
    Color strokeColor;
    BasicStroke stroke;

    /* This method is called by classes that have instantiated this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * a triangle that is visible, given that this shape's fields are initialized prior.
     */
    public void draw(Graphics2D g2d) {
        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(x1, y1);
        triangle.lineTo(x2, y2);
        triangle.lineTo(x3, y3);
        /*closePath() 
        Richard Heyes. 2014. Path2D objects. Rgraph. URL: https://www.rgraph.net/blog/path-objects.html  */
        triangle.closePath();
        g2d.translate(tx, ty);
        g2d.rotate(theta);
        g2d.setColor(fillColor);
        g2d.fill(triangle);
        g2d.setColor(strokeColor);
        g2d.setStroke(stroke);
        g2d.draw(triangle);
    }

    /* This is a mutator method to set up the Triangle shape's tx and ty fields before calling
       the draw(Graphics g2d) method on this class. It mofidies the arguments
       passed through the translate() method called within draw(Graphics2D g2d)
       and replaces them with double x and double y respectively.
     */
    public void translate(double x, double y) {
        tx = x;
        ty = y;
    }

    /* This is a mutator method to set up the Triangle shape's rotate field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the rotate(theta) method called within draw(Graphics2D g2d)
        and replaces it with double t.
     */
    public void rotate(double t) {
        theta = t;
    }

    /* This is a mutator method to set up the Triangle shape's fillColor field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setColor(fillColor) method called within draw(Graphics2D g2d)
        and replaces it with Color c.
     */
    public void setFillColor(Color c) {
        fillColor = c;
    }

    /* This is a mutator method to set up the Triangle shape's strokeColor field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setColor(strokeColor) method called within draw(Graphics2D g2d)
        and replaces it with Color c.
     */
    public void setStrokeColor(Color c) {
        strokeColor = c;
    }

    /* This is a mutator method to set up the Triangle shape's stroke field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setStroke(stroke) method called within draw(Graphics2D g2d)
        and replaces it with BasicStroke s.
     */
    public void setStroke(BasicStroke s) {
        stroke = s;
    }

    /* This is a mutator method to set up the Triangle shape's s field before calling the
        draw(Graphicsg2d) method on this class. Essentially, this method redraws the triangle
        given 3 points. 
     */
    public void resize(double a, double b, double c, double d, double e, double f) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
        x3 = e;
        y3 = f;
    }
}
