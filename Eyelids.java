/**
This Eyelids.java class is a semi-composite shape class wherein the
Arc class is instantiated twice to create Bokuto's eyelids.
This class implements the DrawingObject interface and defines
its draw(Graphics g2d) method to produce the said eyelids visuaully.

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
import java.awt.geom.Arc2D;

public class Eyelids extends UniversalStyles implements DrawingObject {

    Arc le = new Arc();
    Arc re = new Arc();
    double xl = 40;
    double yl = 140;
    double xr = 15;
    double yr = 145;

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's eyelids.
     */
    public void draw(Graphics2D g2d) {
        
        // Left Eyelid
        le.resize(0,0, 51.24+10, 62.33+10, xl, yl, Arc2D.CHORD);
        le.rotate(0.279253);
        le.translate(394.73, 227.18);
        le.setFillColor(bodyColor);
        le.setStrokeColor(strokeColor);
        le.setStroke(universalStroke);
        le.draw(g2d);
        g2d.rotate(6.003937);
        g2d.translate(-394.73, -227.18);

        // Right Eyelid
        re.resize(0, 0, 58.28+10, 68.16+10, xr, yr, Arc2D.CHORD);
        re.rotate(0.232826922);
        re.translate(511, 233.4);
        re.setFillColor(bodyColor);
        re.setStrokeColor(strokeColor);
        re.setStroke(universalStroke);
        re.draw(g2d);
        g2d.rotate(6.050363078);
        g2d.translate(-511, -233.4);
    }

    /* This method is called by an ActionListener in the Controller.java class
        to make Bokuto blink. The fields concerned with each arc's start and extent
        are mutated to give the illusion of Bokuto blinking.
    */
    public void blink() {
        if (xl == 0 && yl == 360 && xr == 0 && yr == 360) {
            xl = 40;
            yl = 140;
            xr = 15;
            yr = 145;
        } else {
            xl = 0;
            yl = 360;
            xr = 0;
            yr = 360;
        }
    }
}