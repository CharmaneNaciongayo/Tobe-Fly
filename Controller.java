/**
This Controller.java class contains components needed for animations.
This class contains a button that triggers Bokuto's wings, as well as
an ActionListener that calls the needed methods to make Bokuto blink.

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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controller extends JPanel implements ActionListener{
    
    private JButton f;
    public SceneCanvas el;
    public Timer timer;

    /* This constructor initializes the button and timers to be used. */
    public Controller() {
        f = new JButton("Tobe Fly!");
        /* Bro Code. 2021. Java 2D animation. YouTube. URL: https://www.youtube.com/watch?v=tHNWIWxRDDA   */
        timer = new Timer(100, this);
        timer.start();
        timer.setRepeats(true);
    }

    /*  This method sets up the button's container and adds the appropriate
        ButtonListeners to the buttons. A new SceneCanvas object is also
        assigned to SceneCanvas.
    */
    public void setUpController(SceneCanvas sc) {
        el = sc;
        setLayout(new GridLayout(1,1));
        add(f);
        ButtonListener bl = new ButtonListener();
        f.addActionListener(bl);
    }
    
    /* This inner class defines the events upon pressing either buttons in
    visible on the screen. */
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                el.getLeftWing().flap();
                el.getRightWing().flap();
                el.repaint();
        }  
    }

   /* This method defines the events upon timer's ends and repeats. */
    public void actionPerformed(ActionEvent e) {
        if (timer.getDelay() == 100) {
            el.getEyelids().blink();
            timer.setDelay(1500);
        } else if (timer.getDelay() == 1500) {
            el.getEyelids().blink();
            timer.setDelay(100);
        }
    } 

    /* This is an accessor method that returns the active SceneCanvas
     * for the reference of omethods that call on different shape classes
     * that have been instantiated inside the SceneCanvas object.
     */
    public SceneCanvas shareCanvas() {
        return el;
    }
}
