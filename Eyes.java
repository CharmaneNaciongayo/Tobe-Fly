/**
This Eyes.java class is a composite shape class wherein the
Ellipse and Triangle classes are instantiated to creaet a Bokuto's eyes.
This class implements the DrawingObject interface and defines its
draw(Graphics g2d) method to produce the said eyes visuaully.

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


public class Eyes extends UniversalStyles implements DrawingObject{

    Ellipse le = new Ellipse();
    Ellipse re = new Ellipse();
    Triangle p = new Triangle();

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's eyes with pupils.
     */
    public void draw(Graphics2D g2d) {
        
        // Left Eye
        le.resize(51.24, 62.33);
        le.setFillColor(eyeColor);
        le.setStrokeColor(strokeColor);;
        le.setStroke(universalStroke);
        le.translate(398.73, 230.18);
        le.rotate(0.279253);
        le.draw(g2d);
        g2d.rotate(6.003937);
        g2d.translate(-398.73, -230.18);

        // Right Eye
        re.resize(58.28, 68.16);
        re.setFillColor(eyeColor);
        re.setStrokeColor(strokeColor);
        re.setStroke(universalStroke);
        re.translate(516, 236.4);
        re.rotate(0.232826922);
        re.draw(g2d);
        g2d.rotate(6.050363078);
        g2d.translate(-516, -236.4);

        // Pupils
        p.setFillColor(pupilColor);
        p.setStroke(noStroke);
        p.resize(403.05, 258.18, 412.07, 286.45, 425.69, 257.52);
        p.draw(g2d);
        p.resize(525.1, 260.51, 528.12, 295.19, 555.88, 260.75);
        p.draw(g2d);

    }
}
