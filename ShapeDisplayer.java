
package shapeDisplayer;

import javax.swing.JFrame;

public class ShapeDisplayer
{
	public static void main(String[] args)
	{
		ShapeFrame frame = new ShapeFrame();

		frame.addShape(new SnowMan(0, 0, 20));
		frame.addShape(new Car(0, 0, 50));
		frame.addShape(new CustomCompositeShape(0, 0, 10));

		frame.setSize(300, 400);
		frame.setTitle("Shape Displayer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
