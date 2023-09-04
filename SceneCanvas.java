/**
This SceneCanvas.java class serves as the drawing canvas for the
animated scene. It is here that shapes are called and draw onto
the JComponent that was added to the SceneFrame's JFrame component.

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

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class SceneCanvas extends JComponent {

    ArrayList<DrawingObject> Shapes;
    Background background = new Background();
    Feathers feathers = new Feathers();
    Body body = new Body();
    LeftWing leftWing = new LeftWing();
    RightWing rightWing = new RightWing();
    Beak beak = new Beak();
    Legs legs = new Legs();
    Eyes eyes = new Eyes();
    Eyelids eyelids = new Eyelids();
    Ears ears = new Ears();

    /* This constructor ensures that when a SceneCanvas object is instantiated,
     * it contains an ArrayList of objects that implement the DrawingObject
     * interface and are required for the overall animated scene.
     */
    public SceneCanvas() {
        setPreferredSize(new Dimension(1024, 768));
        Shapes = new ArrayList<DrawingObject>();
        Shapes.add(background);
        Shapes.add(legs);
        Shapes.add(leftWing);
        Shapes.add(rightWing);
        Shapes.add(body);
        Shapes.add(feathers);
        Shapes.add(eyes);
        Shapes.add(eyelids);
        Shapes.add(beak);
        Shapes.add(ears);
    }

    /*  This method draws all the shapes in the Shapes ArrayList onto
        the canvas.
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
        RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        for (DrawingObject shape : Shapes) {
                shape.draw(g2d);
        }
    }

    /* This accessor method returns the Eyelids object that was
     * instantiated in this class.
     */
    public Eyelids getEyelids() {
        return eyelids;
    }

    /* This accessor method returns the LeftWing object that was
     * instantiated in this class.
     */
    public LeftWing getLeftWing() {
        return leftWing;
    }

    /* This accessor method returns the RightWing object that was
     * instantiated in this class.
     */
    public RightWing getRightWing() {
        return rightWing;
    }

    /* This accessor method returns the Legs object that was
     * instantiated in this class.
     */
    public Legs getLegs(){ 
        return legs;
    }
}