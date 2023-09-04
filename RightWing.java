/**
This RightWing.java class is an organic shape class wherein Bokuto's right wing
is drawn using multiple Path2D objects. It implements the DrawingObject.java
interface and defines its draw(Graphics2D g2d) method to draw Bokuto's right wing.

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

public class RightWing extends UniversalStyles implements DrawingObject {

    double rotate = Math.toRadians(0);
    double reset = Math.toRadians(0);

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's right wing.
     */
    public void draw(Graphics2D g2d) {

        // Base Fill
        Path2D.Double bf = new Path2D.Double();
        bf.moveTo(580, 350.79);
        bf.curveTo(682.59, 272.51, 762.2, 219.34, 798.98, 234.34);
        bf.curveTo(802.23, 243.07, 800.75, 265.24, 771.82, 295.98);
        bf.curveTo(801.37, 293.34, 824.54, 306.44, 759.66, 348.39);
        bf.curveTo(792.13, 346.16, 832.53, 352.26, 734.31, 394.47);
        bf.curveTo(762.17, 394.78, 800.23, 402.59, 729.64, 431.34);
        bf.curveTo(723.77, 453.3, 618.38, 517.65, 649.82, 348.39);
        bf.lineTo(580, 350.79);

        // Secondary Fill
        Path2D.Double sf = new Path2D.Double();
        sf.moveTo(647.3, 300.79);
        sf.curveTo(682.59, 272.51, 762.2, 219.34, 798.98, 234.34);
        sf.curveTo(781.8, 235.72, 730.89, 257.33, 649.82, 348.39);
        sf.lineTo(580, 350.79);
        
        g2d.rotate(rotate, 730, 345);
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
        g2d.rotate(reset, 730, 345);

    }

    /* This method is called by an ActionListener in the Controller.java class
        to make Bokuto flap his right wing. The fields concerned with the rotation
        of Bokuto's wings are mutated to give the illusion of Bokuto flapping
        his right wing.
    */
    public void flap() {
        if (rotate == Math.toRadians(15) && reset == Math.toRadians(-15)) {
            rotate = 0;
            reset = 0;
        } else {
            rotate = Math.toRadians(15);
            reset = Math.toRadians(-15);
        }
    }
}
