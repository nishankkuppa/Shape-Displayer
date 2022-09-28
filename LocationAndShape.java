package shapeDisplayer;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

/**
 * Creates an object consisting of a shape and its 2D location on the panel
 * Translates the object
 * @author Nishank Kuppa
 *
 */
public class LocationAndShape
{
	private Point2D location;
	private CompositeShape shape;

	public LocationAndShape(Point2D location, CompositeShape shape)
	{
		this.location = location;
		this.shape = shape;
	}

	public void draw(Graphics2D g2)
	{
		AffineTransform moveFigure = g2.getTransform();		// to translate the shape
		g2.translate(location.getX(), location.getY());
		
		shape.draw(g2);
		g2.setTransform(moveFigure);
	}
}
