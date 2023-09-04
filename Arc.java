/**
This Arc.java class is a basic shape class wherein an Arc shape
is set up for drawing. This class implements the DrawingObject
interface and defines its draw(Graphics g2d) method to produce an Arc.

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

public class Arc extends UniversalStyles implements DrawingObject{
    double x1 = 0;
    double y1 = 0;
    double w = 0;
    double h = 0;
    double start = 0;
    double extent = 0;
    int type = Arc2D.CHORD;
    double tx = 0;
    double ty = 0;
    double theta = 0;
    Color fillColor;
    Color strokeColor;
    BasicStroke stroke = universalStroke;

    /* This method is called by classes that have instantiated this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * an Arc that is visible, given that this shape's fields are initialized prior.
     */
    public void draw(Graphics2D g2d) {
        /* Java. n.d. Class Arc2D. Oracle Java Documentation. URL: https://docs.oracle.com/javase/7/docs/api/java/awt/geom/Arc2D.html */
        Arc2D.Double arc = new Arc2D.Double(x1, y1, w, h, start, extent, type);
        g2d.translate(tx, ty);
        g2d.rotate(theta);
        g2d.setColor(fillColor);
        g2d.fill(arc);
        g2d.setColor(strokeColor);
        g2d.setStroke(stroke);
        g2d.draw(arc);
    }

    /* This is a mutator method to set up the Arc shape's tx and ty fields before calling
       the draw(Graphics g2d) method on this class. It mofidies the arguments
       passed through the translate() method called within draw(Graphics2D g2d)
       and replaces them with double x and double y respectively.
     */
    public void translate(double x, double y) {
        tx = x;
        ty = y;
    }

    /* This is a mutator method to set up the Arc shape's rotate field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the rotate(theta) method called within draw(Graphics2D g2d)
        and replaces it with double t.
     */
    public void rotate(double t) {
        theta = t;
    }

    /* This is a mutator method to set up the Arc shape's fillColor field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setColor(fillColor) method called within draw(Graphics2D g2d)
        and replaces it with Color c.
     */
    public void setFillColor(Color c) {
        fillColor = c;
    }

    /* This is a mutator method to set up the Arc shape's strokeColor field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setColor(strokeColor) method called within draw(Graphics2D g2d)
        and replaces it with Color c.
     */
    public void setStrokeColor(Color c) {
        strokeColor = c;

    }

    /* This is a mutator method to set up the Arc shape's stroke field before calling
        the draw(Graphicsg2d) method on this class. It modifies the argument
        passed through the setStroke(stroke) method called within draw(Graphics2D g2d)
        and replaces it with BasicStroke s.
     */
    public void setStroke(BasicStroke s) {
        stroke = s;
    }

    /* This is a mutator method to set up the Arc shape's x1, y1, w, h, h, start,
        extent, and type fields before calling the draw(Graphicsg2d) method on this class.
        Essentially, this method redraws the arc and replaces the current arc's arguments
        x1, y1, w, h, start, extent, and type with double a, double b, double c, double d,
        double e, double f, and int g respectively.
     */
    public void resize(double a, double b, double c, double d, double e, double f, int g) {
        x1 = a;
        y1 = b;
        w = c;
        h = d;
        start = e;
        extent = f;
        type = g;
    }
}
