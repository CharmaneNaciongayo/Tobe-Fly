/**
This Body.java class is an organic shape class wherein Bokuto's body
is drawn using multiple Path2D objects. It implements the DrawingObject.java
interface and defines its draw(Graphics2D g2d) method to draw Bokuto's body.

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

public class Body extends UniversalStyles implements DrawingObject{

    /* This method is called by classes instantiating this class. Calling
     * on this method and passing through it a Graphics2D object draws
     * Bokuto's body.
     */
    public void draw(Graphics2D g2d) {
        
        // Bokuto Sillhouette
        Path2D.Double bs = new Path2D.Double();
        bs.moveTo(347.91,264.21);
        bs.curveTo(369.5, 219.92, 398.53, 189.98, 429.94, 173.16);
        bs.curveTo(439.6, 160.58, 458, 131.1, 454.31, 113.87);
        bs.curveTo(458.79, 117.33, 467.08, 126.87, 464.31, 137.33);
        bs.curveTo(468.38, 129.81, 478.88, 114.4, 488.31, 112.9);
        bs.curveTo(487.06, 118.48, 485.3, 130.22, 488.31, 132.54);
        bs.curveTo(497.7, 126.31, 519.05, 113.87, 529.3, 113.87);
        bs.curveTo(528.68, 120.88, 528.04, 135.16, 530.5, 136.13);
        bs.curveTo(535.68, 133.11, 552.5, 128.41, 578.32, 133.73);
        bs.curveTo(574.56, 139.66, 567.9, 152.93, 571.32, 158.67);
        bs.curveTo(577.47, 155.94, 591.78, 151.6, 599.84, 156.11);
        bs.curveTo(595.57, 161.09, 587.45, 172.08, 589.17, 176.16);
        bs.curveTo(627.76, 217.91, 641.77, 265.87, 643.95, 284.63);
        bs.curveTo(650.63, 284.1, 657.24, 287.22, 659.72, 288.84);
        bs.curveTo(651.02, 283.29, 657.61, 285.88, 659.81, 287.08);
        bs.curveTo(654.74, 292.38, 650.56, 300.22, 649.93, 303.73);
        bs.curveTo(652.24, 307.41, 656.41, 308.28, 666.59, 308.28);
        bs.curveTo(665.21, 317.71, 661.63, 324.16, 653.85, 328.15);
        bs.curveTo(644.68, 367.67, 635.79, 550.13, 701.43, 470); // 
        bs.curveTo(702.64, 470.32, 688.31, 493.7, 684.44, 499.01);
        bs.curveTo(688.79, 499.47, 699.16, 499.23, 705.79, 494.61);
        bs.curveTo(585.14, 689.96, 216.55, 678.45, 328.39, 328.15);
        bs.curveTo(321.85, 319.73, 309.06, 297.69, 310.19, 276.98);
        bs.curveTo(313.6, 276.79, 322, 277.93, 328.39, 284.01);
        bs.curveTo(325.45, 278.2, 320.46, 263.58, 323.98, 251.64);
        bs.curveTo(327.08, 252.14, 336.21, 255.34, 347.91, 264.21);
        g2d.setColor(bodyColor);
        g2d.fill(bs);
        g2d.draw(bs);

        // Top Feathers
        Path2D.Double ff = new Path2D.Double();
        ff.moveTo(564.14, 283.14);
        ff.curveTo(605.87, 292.65, 592.77, 303.80, 581, 308.19);
        ff.lineTo(595.88, 340.4);
        ff.lineTo(578.84, 340.4);
        ff.lineTo(574.79, 363.79);
        ff.curveTo(584.5, 400.19, 570.750, 389.84, 562.66, 380.11);
        ff.lineTo(546.05, 384.01);
        ff.curveTo(551.14, 425.03, 531.03, 409.86, 520.35, 397.16);
        ff.curveTo(511.33, 430.08, 489.73, 410.88, 480.05, 397.16);
        ff.curveTo(465.15, 428.58, 452.18, 408.32, 447.56, 394.27);
        ff.curveTo(423.58, 422.2, 418.73, 401.6, 417.97, 387.52);
        ff.curveTo(389.19, 419.49, 385.17, 391.32, 386.75, 373.24);
        ff.curveTo(376.61, 380.92, 370.83, 379.08, 366.77, 377.43);
        ff.lineTo(368.48, 338.22);
        ff.lineTo(362.09, 323.21);
        ff.lineTo(366.77, 310.24);
        ff.lineTo(353.45, 298.06);
        ff.lineTo(369.82, 284.93);
        ff.curveTo(362.2, 255.69, 378.37, 263.62, 390.94, 274.27);
        ff.lineTo(449.37, 233.54);
        ff.lineTo(456.8, 243.05);
        ff.curveTo(473.24, 218.69, 477.35, 234.43, 477.35, 245.34);
        ff.curveTo(497.6, 227.07, 500.51, 240.26, 499.43, 249.14);
        ff.lineTo(564.14, 283.14);
        g2d.setStroke(noStroke);

        g2d.setColor(bodyAccentColor);
        g2d.fill(ff);
        g2d.draw(ff);

        // Bottom Feathers
        Path2D.Double cf = new Path2D.Double();
        cf.moveTo(618.03, 580.02);
        cf.curveTo(390.84, 711.08, 251.91, 517.03, 329.31, 328.37);
        cf.curveTo(312.98, 309.2, 310.21, 286.12, 310.87, 276.97);
        cf.curveTo(315.53, 277.23, 323.22, 280.44, 326.47, 282.02);
        cf.curveTo(319.79, 267.17, 323.04, 256.02, 325.5, 252.3);
        cf.curveTo(329.89, 252, 341.7, 260.52, 347.05, 264.82);
        cf.curveTo(387.18, 188.93, 431.64, 166.64, 429.94, 173.16);
        cf.curveTo(395.35, 206.59, 360.47, 258.02, 349.72, 278.54);
        cf.curveTo(344.75, 273.12, 339.77, 267.79, 332.58, 264.82);
        cf.curveTo(331.4, 275.66, 338.07, 293.18, 341.56, 300.58);
        cf.curveTo(335.94, 295.61, 324.85, 291, 320.01, 289.31);
        cf.curveTo(322.75, 301.72, 333.82, 319.64, 339.02, 327.06);
        cf.curveTo(324.86, 355.94, 323, 409.41, 323.84, 432.53);
        cf.curveTo(329.36, 430.8, 337.73, 431.81, 341.23, 432.53);
        cf.curveTo(338.99, 411.94, 350.62, 420.15, 356.72, 426.82);
        cf.lineTo(368.83, 435.91);
        cf.lineTo(382.69, 436.96);
        cf.lineTo(404.58, 448.95);
        cf.curveTo(421.82, 424.08, 430.47, 438.59, 432.65, 448.95);
        cf.curveTo(450.81, 431.06, 463.82, 444.91, 468.05, 454.08);
        cf.curveTo(480.26, 439.73, 487.86, 437.59, 492.39, 439.17);
        cf.lineTo(509.74, 440.33);
        cf.lineTo(541.3, 451.63);
        cf.curveTo(562.17, 436.26, 564.36, 451.36, 562.85, 460.83);
        cf.curveTo(605.52, 430.74, 604.23, 458.31, 598.25, 475.85);
        cf.curveTo(641.95, 465.05, 622.75, 491.77, 607.69, 506.48);
        cf.curveTo(634.15, 497.63, 624.15, 519.02, 615.84, 530.82);
        cf.curveTo(634.1, 538, 622.13, 552.52, 613.86, 558.89);
        cf.curveTo(629.23, 561.13, 623.23, 574.24, 618.03, 580.02);
        g2d.setStroke(new BasicStroke(0));
        g2d.setColor(bodyAccentColor);
        g2d.fill(cf);
        g2d.draw(cf);
        
        // Body Stroke
        Path2D.Double fo = new Path2D.Double();
        fo.moveTo(347.91,264.21);
        fo.curveTo(369.5, 219.92, 398.53, 189.98, 429.94, 173.16);
        fo.curveTo(439.6, 160.58, 458, 131.1, 454.31, 113.87);
        fo.curveTo(458.79, 117.33, 467.08, 126.87, 464.31, 137.33);
        fo.curveTo(468.38, 129.81, 478.88, 114.4, 488.31, 112.9);
        fo.curveTo(487.06, 118.48, 485.3, 130.22, 488.31, 132.54);
        fo.curveTo(497.7, 126.31, 519.05, 113.87, 529.3, 113.87);
        fo.curveTo(528.68, 120.88, 528.04, 135.16, 530.5, 136.13);
        fo.curveTo(535.68, 133.11, 552.5, 128.41, 578.32, 133.73);
        fo.curveTo(574.56, 139.66, 567.9, 152.93, 571.32, 158.67);
        fo.curveTo(577.47, 155.94, 591.78, 151.6, 599.84, 156.11);
        fo.curveTo(595.57, 161.09, 587.45, 172.08, 589.17, 176.16);
        fo.curveTo(627.76, 217.91, 641.77, 265.87, 643.95, 284.63);
        fo.curveTo(650.63, 284.1, 657.24, 287.22, 659.72, 288.84);
        fo.curveTo(651.02, 283.29, 657.61, 285.88, 659.81, 287.08);
        fo.curveTo(654.74, 292.38, 650.56, 300.22, 649.93, 303.73);
        fo.curveTo(652.24, 307.41, 656.41, 308.28, 666.59, 308.28);
        fo.curveTo(665.21, 317.71, 661.63, 324.16, 653.85, 328.15);
        fo.curveTo(644.68, 367.67, 635.79, 550.13, 701.43, 470); // 
        fo.curveTo(702.64, 470.32, 688.31, 493.7, 684.44, 499.01);
        fo.curveTo(688.79, 499.47, 699.16, 499.23, 705.79, 494.61);
        fo.curveTo(585.14, 689.96, 216.55, 678.45, 328.39, 328.15);
        fo.curveTo(321.85, 319.73, 309.06, 297.69, 310.19, 276.98);
        fo.curveTo(313.6, 276.79, 322, 277.93, 328.39, 284.01);
        fo.curveTo(325.45, 278.2, 320.46, 263.58, 323.98, 251.64);
        fo.curveTo(327.08, 252.14, 336.21, 255.34, 347.91, 264.21);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.draw(fo);

        // Mouth Line
        Path2D.Double m = new Path2D.Double();
        m.moveTo(420.46, 311.2);
        m.lineTo(431.53, 303.59);
        m.lineTo(434.76, 319.73);
        m.lineTo(465.19, 321.11);
        m.lineTo(477.86, 311.2);
        m.lineTo(485.47, 321.11);
        m.lineTo(492.16, 315.81);
        g2d.setColor(strokeColor);
        g2d.setStroke(universalStroke);
        g2d.draw(m);

    }

}
