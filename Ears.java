/**
This Ears.java class is an organic shape class wherein Bokuto's owl ears
are drawn using multiple Path2D objects. It implements the DrawingObject.java
interface and defines its draw(Graphics2D g2d) method to draw Bokuto's owl ears.

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

public class Ears extends UniversalStyles implements DrawingObject {

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's ears.
     */
    public void draw(Graphics2D g2d) {
        
        // Left Ear Base
        Path2D.Double le = new Path2D.Double();
        le.moveTo(444.86, 257.31);
        le.curveTo(403.63, 197.58, 423.24, 127.95, 438.2, 100.61);
        le.curveTo(455.59, 173.81, 449.88, 235.58, 444.86, 257.31);
        g2d.setColor(bodyColor);
        g2d.fill(le);
        g2d.draw(le);

        // Left Ear Shadow
        Path2D.Double les = new Path2D.Double();
        les.moveTo(438.8, 232.79);
        les.curveTo(421.74, 212.24, 427.06, 155.74, 435.35, 132.45);
        les.curveTo(446.32, 157.03, 446.69, 225.45, 438.8, 232.79);
        g2d.setColor(featherColor);
        g2d.fill(les);
        g2d.setStroke(noStroke);
        g2d.draw(les);

        // Left Ear Highlight
        Path2D.Double leh = new Path2D.Double();
        leh.moveTo(437.9, 101.23);
        leh.curveTo(432.72, 109.06, 420.09, 135.65, 435.35, 136.33);
        leh.curveTo(448.53, 136.91, 441.71, 110.02, 437.9, 101.23);
        g2d.setColor(bodyAccentColor);
        g2d.fill(leh);
        g2d.draw(leh);

        // Left Ear Outline
        Path2D.Double lol = new Path2D.Double();
        lol.moveTo(444.86, 257.31);
        lol.curveTo(403.63, 197.58, 423.24, 127.95, 438.2, 100.61);
        lol.curveTo(455.59, 173.81, 449.88, 235.58, 444.86, 257.31);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.draw(lol);

        // Right Ear Base
        Path2D.Double re = new Path2D.Double();
        re.moveTo(499.9, 254.86);
        re.curveTo(509.01, 230.32, 551.22, 180.33, 647.13, 176.68);
        re.curveTo(624.81, 198.18, 564.12, 243.92, 499.9, 254.86);
        g2d.setColor(bodyColor);
        g2d.fill(re);
        g2d.draw(re);

        // Right Ear Shadow
        Path2D.Double res = new Path2D.Double();
        res.moveTo(517.58, 239.89);
        res.curveTo(538.1, 203.76, 600, 185.64, 621.53, 186.61);
        res.curveTo(602.39, 202.23, 544.99, 239.89, 517.58, 239.89);
        g2d.setStroke(noStroke);
        g2d.setColor(featherColor);
        g2d.fill(res);
        g2d.draw(res);

        // Right Ear Outline
        Path2D.Double rol = new Path2D.Double();
        rol.moveTo(499.9, 254.86);
        rol.curveTo(509.01, 230.32, 551.22, 180.33, 647.13, 176.68);
        rol.curveTo(624.81, 198.18, 564.12, 243.92, 499.9, 254.86);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.draw(rol);
    }
}
