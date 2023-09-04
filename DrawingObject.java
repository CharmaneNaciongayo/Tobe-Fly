/**
This DrawingObject.java class is a an interface that is implemented
by all shape classes, composite, basic, or organic. It requires that
all classes that implement this interface properly define their respective
draw(Graphics2D g2d) method.

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

interface DrawingObject {
    /* This is an abstract method that is implemented by all implementing classes. */
    void draw(Graphics2D g2d);
}
