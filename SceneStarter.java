/**
This SceneStarter.java class is run on console. It sets instantiates the
SceneFrame.java class and sets up its GUI properties and components. 

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

/*
  External Sources

  GradientPaint & setPaint()
  Wayan. 2022. How do I create a gradient paint in Java 2D?. Kode Java. URL: https://kodejava.org/how-do-i-create-a-gradient-paint-in-java-2d/ 
  
  (int) before RGB Value Parameter 
  MsZalBach. 2013. IllegalArgumentException: Color parameter outside of expected range: Red Green Blue. Stack Overflow. URL: https://stackoverflow.com/questions/16497390/illegalargumentexception-color-parameter-outside-of-expected-range-red-green-b 

  Stroke Styles
  Java. n.d. Stroking and Filling Graphics Primitives. Oracle Java Documentation. URL: https://docs.oracle.com/javase/tutorial/2d/geometry/strokeandfill.html

  Animation using Timer objects
  Bro Code. 2021. Java 2D animation. YouTube. URL: https://www.youtube.com/watch?v=tHNWIWxRDDA  

  Arc2D
  Java. n.d. Class Arc2D. Oracle Java Documentation. URL: https://docs.oracle.com/javase/7/docs/api/java/awt/geom/Arc2D.html

  How to add audio to a Java program
  Bro Code. 2021. Java Audio. YouTube. URL: https://www.youtube.com/watch?v=SyZQVJiARTQ&t=423s

  closePath() 
  Richard Heyes. 2014. Path2D objects. Rgraph. URL: https://www.rgraph.net/blog/path-objects.html 
 */

public class SceneStarter {
    public static void main(String[] args) {
      SceneFrame mainFrame = new SceneFrame();
      mainFrame.setUpGUI();  
    }
}