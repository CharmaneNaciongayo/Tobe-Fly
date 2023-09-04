/**
This SceneFrame.java class extends JFrame and sets up the said JFrame.
This class also implements ActionListeners that enable the floating
animation of Bokuto in the animated scene.

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

import java.io.*;
import javax.sound.sampled.*;

public class SceneFrame extends JFrame implements ActionListener {
    SceneCanvas sc;
    Controller controls;
    JButton fly;
    JButton blink;

    int velocityX = 1;
    private Timer timer;
    
    /* This method sets up the JFrame and adds to it the needed components,
     * timers, SceneCanvas object, and Controller object. Properties of the
     * rendered frame are also set up in this method. 
     */
    public void setUpGUI() {
        Container cp = this.getContentPane();
        sc = new SceneCanvas();
        controls = new Controller();
        controls.setUpController(sc);
        cp.add(sc, BorderLayout.CENTER);
        cp.add(controls, BorderLayout.SOUTH);
        /* Bro Code. 2021. Java 2D animation. YouTube. URL: https://www.youtube.com/watch?v=tHNWIWxRDDA   */
        timer = new Timer(100, this);
        timer.start();
        timer.setRepeats(true);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Midterm Project - Naciongayo, Maria Charmane Rose - 214152");
        this.setVisible(true);
        this.playSound();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /* This method defines the events upon the starts and repeats of the timer
    object. This method dictates the floating animation of Bokuto in the
    animated scene.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        SceneCanvas el = controls.shareCanvas();
        Legs legs = el.getLegs();
        legs.levitate(velocityX);
             if (legs.getFlyingPosition() == 20 || legs.getFlyingPosition() == 0) {
                   velocityX = velocityX * -1;
             }
        el.repaint();
    }    

    /* This method plays Tobe Fly as soon as it is called. */
    /* How to add audio to a Java program - Bro Code. 2021. Java Audio. YouTube. URL: https://www.youtube.com/watch?v=SyZQVJiARTQ&t=423s */
    public void playSound() {
        try {
        File file = new File("bgm.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        } catch (Exception e) {}
    }
}
