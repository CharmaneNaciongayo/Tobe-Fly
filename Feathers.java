/**
This Feathers.java class is an organic shape class wherein Bokuto's feathers
are drawn using multiple Path2D objects. It implements the DrawingObject.java
interface and defines its draw(Graphics2D g2d) method to draw Bokuto's feathers.

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

public class Feathers extends UniversalStyles implements DrawingObject{
    
    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's feathers.
     */
    public void draw(Graphics2D g2d) {
        
        Path2D.Double af = new Path2D.Double();

        // Chest Accents
        af.moveTo(354, 458.14);
        af.curveTo(346.98, 439.67, 357.88, 407.05, 370.08, 414.49);
        af.curveTo(390.62, 427.02, 359.65, 441.65, 354, 458.14);
        af.moveTo(381.61, 473.45);
        af.curveTo(373.07, 455.71, 383.1, 415, 397.18, 426.58);
        af.curveTo(411.68, 438.5, 385.4, 457.2, 381.61, 473.45);
        af.moveTo(507.45, 480.53);
        af.curveTo(495.05, 463.11, 480.84, 443.87, 496.39, 435.96);
        af.curveTo(516.61, 425.69, 511.85, 461.1, 507.45, 480.53);
        af.moveTo(534.46, 483.9);
        af.curveTo(532.94, 481.37, 508.43, 432.41, 530.61, 431.62);
        af.curveTo(547.77, 431.01, 541.28, 468.53, 534.46, 483.9);
        g2d.setColor(new Color(103, 84, 63));

        // Face Accents 
        af.moveTo(344.15, 319.97);
        af.curveTo(350.64, 315.01, 376.47, 312, 369.08, 302.11);
        af.curveTo(359.19, 288.89, 341.4, 304.09, 337.09, 313.41);
        af.curveTo(334.23, 319.59, 339.39, 324.11, 344.15, 319.97);
        af.moveTo(350.75, 349.31);
        af.curveTo(360.8, 342.35, 386.99, 332.5, 379.24, 323.58);
        af.curveTo(369.06, 311.84, 350.16, 332.5, 346.48, 343.27);
        af.curveTo(343.79, 352.59, 349.18, 350.4, 350.75, 349.31);
        af.moveTo(354.72, 390.15);
        af.curveTo(367.36, 372.13, 394.63, 361.48, 383.88, 352.43);
        af.curveTo(372.51, 342.85, 350.93, 358, 349.44, 387.86);
        af.curveTo(349.34, 393.73, 352.18, 393.76, 354.72, 390.15);
        af.moveTo(557.33, 398.41);
        af.curveTo(543.17, 381.56, 525.79, 352.59, 539.98, 347.89);
        af.curveTo(555.05, 342.9, 563.99, 383.97, 563.99, 395.7);
        af.curveTo(563.99, 403.4, 563.36, 405.58, 557.33, 398.41);
        af.moveTo(590.22, 377.53);
        af.curveTo(576.7, 368.2, 551.42, 341.83, 563.99, 333.99);
        af.curveTo(578.9, 324.68, 593.87, 368.87, 594.96, 373.88);
        af.curveTo(596.04, 378.88, 594.96, 380.5, 590.22, 377.53);
        af.moveTo(603.34, 349);
        af.curveTo(586.24, 328.49, 574.45, 324.11, 582.79, 314.92);
        af.curveTo(593.4, 303.22, 610.1, 337.37, 611.86, 342.78);
        af.curveTo(613.62, 348.18, 607.19, 353.45, 603.34, 349);

        // Head Feathers
        af.moveTo(461.11, 207.65);
        af.curveTo(455.19, 204.19, 453.72, 162.6, 463.42, 163.22);
        af.curveTo(470.17, 163.65, 467.11, 198.23, 461.11, 207.65);
        af.moveTo(475.51, 213.31);
        af.curveTo(464.84, 192.65, 485.85, 141.57, 494.75, 144.69);
        af.curveTo(509.28, 149.78, 479.58, 192.61, 475.03, 214.87);
        af.moveTo(491.4, 215.28);
        af.curveTo(487.3, 188.95, 530.77, 141.81, 537.64, 148.43);
        af.curveTo(546.68, 157.13, 500, 195.64, 491.4, 215.28);
        af.moveTo(500.4, 216.64);
        af.curveTo(525.09, 181.85, 555.11, 170.04, 556.61, 177.21);
        af.curveTo(560.43, 195.49, 517.09, 213.55, 500.4, 216.64);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.setColor(featherColor);
        g2d.fill(af);
        g2d.draw(af);
    }
}
