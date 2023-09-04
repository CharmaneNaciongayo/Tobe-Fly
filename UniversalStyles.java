/**
This UniversalStyles.java class is an abstract class that is extended
by all shape classes in this package. This class contains all the repeated
colors, gradients, and strokes that are used all throughout my animated scene.

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

public abstract class UniversalStyles {

    // Fill Colors
    /* MsZalBach. 2013. IllegalArgumentException: Color parameter outside of expected range: Red Green Blue. Stack Overflow. URL: https://stackoverflow.com/questions/16497390/illegalargumentexception-color-parameter-outside-of-expected-range-red-green-b  */
    Color bodyColor = new Color((int)200, (int)181, (int)160);
    Color bodyAccentColor = new Color((int)254, (int)249, (int)246);
    Color featherColor = new Color((int)103, (int)84, (int)63);
    Color beakColor = new Color((int)152, (int)140, (int)130);
    Color eyeColor = new Color((int)227, (int)160, (int)48);
    Color pupilColor = new Color((int)106, (int)72, (int)26);
    Color polkaDotColor = new Color((int)169, (int)156, (int)42);
    Color ballColor = Color.WHITE;
    Color legColor = new Color((int)185, (int)168, (int)118);
    Color noColor = new Color((int)0, (int)0, (int)0, 0);

    // Gradient Styles
    Color gradientStart = new Color((int)252, (int)242, (int)119);
    Color gradientEnd = new Color((int)244, (int)248, (int)249);
    /* Wayan. 2022. How do I create a gradient paint in Java 2D?. Kode Java. URL: https://kodejava.org/how-do-i-create-a-gradient-paint-in-java-2d/  */
    GradientPaint backgroundGradient = new GradientPaint(1024/2, 0, gradientStart, 1024/2, 768, gradientEnd, true);
    
    // Strokes
    Color strokeColor = Color.BLACK;
    /* Java. n.d. Stroking and Filling Graphics Primitives. Oracle Java Documentation. URL: https://docs.oracle.com/javase/tutorial/2d/geometry/strokeandfill.html */
    BasicStroke universalStroke = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
    BasicStroke noStroke = new BasicStroke(0);
}

