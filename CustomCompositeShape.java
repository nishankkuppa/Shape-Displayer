package shapeDisplayer;

import java.awt.geom.Ellipse2D;

/**
 * Models five circles in a T-shape
 * @author Nishank Kuppa
 *
 */
public class CustomCompositeShape extends CompositeShape
{
	private Ellipse2D.Double bottomCircle1, bottomCircle2, leftCircle, rightCircle, middleCircle;

	public CustomCompositeShape(int xCoordinate, int yCoordinate, int width)
	{
		super(xCoordinate, yCoordinate);
		
		middleCircle = new Ellipse2D.Double(getX(), getY(), width, width);
		bottomCircle1 = new Ellipse2D.Double(getX(), getY() + width, width, width);
		bottomCircle2 = new Ellipse2D.Double(getX(), getY() + 2*width, width, width);
		leftCircle = new Ellipse2D.Double(getX() + width, getY(), width, width);
		rightCircle = new Ellipse2D.Double(getX() - width, getY(), width, width);
		
		add(bottomCircle1);
		add(bottomCircle2);
		add(leftCircle);
		add(rightCircle);
		add(middleCircle);
	}
}
