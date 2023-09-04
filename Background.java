/**
This Background.java class is a composite shape class wherein the
Rectangle and Circle classes are instantiated to creaet a gradient
background with polka dots. This class implements the DrawingObject
interface and defines its draw(Graphics g2d) method to produce the said
background visuaully.

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
import java.util.ArrayList;

public class Background extends UniversalStyles implements DrawingObject{

    Rectangle gradient = new Rectangle();
    ArrayList<Circle> polkaDots = new ArrayList<>();

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * polkadots on a gradient background.
     */
    public void draw(Graphics2D g2d) {
        
        // Creating Background 
        Rectangle bg = new Rectangle();
        bg.resize(1024, 768);
        /* Wayan. 2022. How do I create a gradient paint in Java 2D?. Kode Java. URL: https://kodejava.org/how-do-i-create-a-gradient-paint-in-java-2d/  */
        bg.setGradient(backgroundGradient);
        bg.draw(g2d);

        // Adding all dots
        for (int i = 0 ; i < 63 ; i++) {
            polkaDots.add(new Circle());
        }

        for (Circle dot : polkaDots) {
            dot.setFillColor(polkaDotColor);
            dot.setStroke(noStroke);
            if (polkaDots.indexOf(dot) == 0) {
                dot.resize(29);
                dot.translate(17.5, 10);
            } else if (polkaDots.indexOf(dot) < 13) {
                dot.resize(29);
                dot.translate(80, 0);

            } else if (polkaDots.indexOf(dot) == 13) {
                g2d.translate(-((12*80)+17.5),-10); // Reset Coordinates
                dot.resize(25);
                dot.translate(60.5, 59);
            } else if (polkaDots.indexOf(dot) < 25) {
                dot.resize(25);
                dot.translate(80, 0);    

            } else if (polkaDots.indexOf(dot) == 25) {
                g2d.translate(-((11*80) + 60.5), -59);
                dot.resize(20);
                dot.translate(22.5, 103);
            } else if (polkaDots.indexOf(dot) < 38) {
                dot.resize(20);
                dot.translate(80, 0);

            } else if (polkaDots.indexOf(dot) == 38) {
                g2d.translate(-((12*80) + 22.5), -103);
                dot.resize(15);
                dot.translate(65.5, 142);
            } else if (polkaDots.indexOf(dot) < 50) {
                dot.resize(15);
                dot.translate(80, 0);

            } else if (polkaDots.indexOf(dot) == 50) {
                g2d.translate(-((11*80) + 65.5), -142);
                dot.resize(10);
                dot.translate(27.5, 176);
            } else if (polkaDots.indexOf(dot) < 63) {
                dot.resize(10);
                dot.translate(80, 0);
            }
            dot.draw(g2d);
        }
        g2d.translate(-((12*80) + 27.5), -176);
    }
}
