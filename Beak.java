/**
This Beak.java class is a composite shape class wherein the
Square and Line classes are instantiated to creaet a bird's beak.
This class implements the DrawingObject interface and defines
its draw(Graphics g2d) method to produce the said beak visuaully.

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

public class Beak extends UniversalStyles implements DrawingObject{
    Square bb = new Square();
    Line l = new Line();
    Square rb = new Square();

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's beak.
     */
    public void draw(Graphics2D g2d) {

        // Beak Base
        bb.resize(25);
        bb.translate(452.5, 300);
        bb.rotate(0.846135621);
        bb.setFillColor(beakColor);
        bb.setStrokeColor(strokeColor);
        bb.setStroke(universalStroke);
        bb.draw(g2d);
        
        // Resetting g2d
        g2d.rotate(5.437049686);
        g2d.translate(-452.5, -300);

        // Beak Line
        l.resize(433.87, 318.27, 466.72, 320.06);
        l.setStrokeColor(strokeColor);
        l.setStroke(universalStroke);
        l.draw(g2d);
    }
    
}
