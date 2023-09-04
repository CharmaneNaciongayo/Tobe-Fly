/**
This Legs.java class is a composite shape class wherein the
Square and Triangle classes are instantiated to create a Bokuto's legs.
This class implements the DrawingObject interface and defines its
draw(Graphics g2d) method to produce the said legs visuaully.

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

/* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's legs.
*/
public class Legs extends UniversalStyles implements DrawingObject{

    Square rb = new Square();
    Square lb = new Square();
    Triangle lts = new Triangle();
    
    double fly = 0;
    public void draw(Graphics2D g2d) {
        g2d.translate(0, fly); // this is for moving the entire body!
        
        // Left Leg Base
        rb.resize(48.84);
        rb.translate(430.23, 611.53);
        rb.rotate(5.871462137160611);
        rb.setFillColor(legColor);
        rb.setStroke(noStroke);
        rb.draw(g2d);
        g2d.rotate(6.28319-5.871462137160611);
        g2d.translate(-430.23, -611.53);

        // Right Leg Base
        lb.resize(48.84);
        lb.translate(581.39, 571.48);
        lb.rotate(5.871462137160611);
        lb.setFillColor(legColor);
        lb.setStroke(noStroke);
        lb.draw(g2d);
        g2d.rotate(6.28319-5.871462137160611);
        g2d.translate(-581.39, -571.48);

        // Left Leg Toes
        lts.setFillColor(legColor);
        lts.resize(449.73, 656.19, 472.34, 646.38, 459.35, 674.62);
        lts.setStroke(noStroke);
        lts.draw(g2d);
        lts.resize(494.43, 636.62, 503.35, 660.11, 472.34, 646.38);
        lts.setStroke(noStroke);
        lts.draw(g2d);

        // Right Leg Toes
        lts.resize(600.94, 616.12, 615.11, 642.06, 622.24, 606.23);
        lts.setStroke(noStroke);
        lts.draw(g2d);
        lts.resize(645.74, 596.7, 657.99, 623.62, 622.13, 606.68);
        lts.setStroke(noStroke);
        lts.draw(g2d);

        // Outlines
        Path2D.Double lo = new Path2D.Double();
        lo.moveTo(433.25, 616.58);
        lo.lineTo(459.64, 675.08);
        lo.lineTo(472.48, 646.3);
        lo.lineTo(503.87, 660.09);
        lo.lineTo(484.37, 611.82);
        lo.moveTo(588.85, 588.49);
        lo.lineTo(614.78, 641.79);
        lo.lineTo(622.34, 606.5);
        lo.lineTo(658, 623.78);
        lo.lineTo(632.07, 564);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.draw(lo);

    }

    /* This method is called by an ActionListener in the SceneFrame.java class.
        It increments the value of fly which affects the translate() values of
        all shapes added to the Shapes ArrayList after this class, essentially
        creating the illusion that Bokuto is floating.
     */
    public void levitate(int velocityX) {
        fly += velocityX;
    }

    /* This method returns the current value of fly. */
    public double getFlyingPosition() {
        return fly;
    }
}

