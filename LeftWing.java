/**
This LeftWing.java class is an organic shape class wherein Bokuto's left wing
is drawn using multiple Path2D objects. It implements the DrawingObject.java
interface and defines its draw(Graphics2D g2d) method to draw Bokuto's left wing.

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
 
public class LeftWing extends UniversalStyles implements DrawingObject {

    double rotate = Math.toRadians(0);
    double reset = Math.toRadians(0);

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's left wing.
     */
    public void draw(Graphics2D g2d) {
        
        // Base Fill
        Path2D.Double bf = new Path2D.Double(); 
        bf.moveTo(345.36,366.82);
        bf.lineTo(309.15, 458.69); // line down
        bf.curveTo(260.6, 436.96, 262.32, 417, 269.25, 409.74);
        bf.curveTo(221.93, 370.35, 229.74, 343.37, 245.78, 349.72);
        bf.curveTo(208.49, 285.07, 225.1, 284.33, 238.06, 292.05);
        bf.curveTo(228.14, 265.76, 230.13, 237.06, 232.36, 225.99); //  here
        bf.curveTo(256.39, 244.43, 309.48, 290.91, 329.6, 329.26);
        
        // Secondary Fill
        Path2D.Double sf = new Path2D.Double(); 
        sf.moveTo(324.96,358.64);
        sf.curveTo(304.88, 345.69, 259.76, 302.23, 232.36, 225.99); // Point of weird
        sf.curveTo(256.39, 244.43, 309.48, 290.91, 329.6, 329.26);
        sf.lineTo(324.96, 358.64);
        g2d.rotate(rotate, 279.96, 343.92);
        g2d.setColor(bodyColor);
        g2d.fill(bf);
        g2d.draw(bf);
        g2d.setColor(bodyAccentColor);
        g2d.fill(sf);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.draw(sf);
        g2d.setColor(noColor);
        g2d.fill(bf);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.draw(bf);
        g2d.rotate(reset, 279.96, 343.92);
    }

    /* This method is called by an ActionListener in the Controller.java class
        to make Bokuto flap his left wing. The fields concerned with the rotation
        of Bokuto's wings are mutated to give the illusion of Bokuto flapping
        his left wing.
    */
    public void flap() {
        if (rotate == Math.toRadians(-15) && reset == Math.toRadians(15)) {
            rotate = 0;
            reset = 0;
        } else {
            rotate = Math.toRadians(-15);
            reset = Math.toRadians(15);
        }
    }
}