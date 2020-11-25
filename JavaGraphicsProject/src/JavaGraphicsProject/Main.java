/*CSCI 111 900
Prof. Herbert
javaGraphicsProject.java
Last edited 12/11/19 by Pat Doyle
 */

package JavaGraphicsProject;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

	// create a MyCanvas object
        MyCanvas canvas1 = new MyCanvas();

        // set up JFrame
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLocation(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add canvas to frame
        frame.getContentPane().add(canvas1);
        frame.setVisible(true);

    } //end main()
} //end class Image

class MyCanvas extends Canvas
{
    public MyCanvas()
    {

    }// end MyCanvas constructor

    //create 3 yellow, connected triangles with blank triangular space in between (tri-force)
    public void paint(Graphics graphics)
    {
        graphics.setColor(Color.yellow);
        int n = 3;
        int[] leftTriX = {10, 90, 170};
        int [] leftTriY = {400, 200, 400};
        graphics.fillPolygon(leftTriX, leftTriY, n);

        graphics.setColor(Color.yellow);
        int[] midTriX = {90, 170, 250};
        int [] midTriY = {200, 0, 200};
        graphics.fillPolygon(midTriX, midTriY, n);


        graphics.setColor(Color.yellow);
        int[] rightTriX = {170, 250, 330};
        int [] rightTriY = {400, 200, 400};
        graphics.fillPolygon(rightTriX, rightTriY, n);

    }
} //end class MyCanvas
