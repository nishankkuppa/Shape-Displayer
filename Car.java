package shapeDisplayer;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * A class to model the shape of a car
 * Code borrowed from textbook page 162
 * 
 * @author Nishank Kuppa
 *
 */
public class Car extends CompositeShape
{
	public Car(int xCoordinate, int yCoordinate, int width)
	{
		super(xCoordinate, yCoordinate);
		
		// Car body
		Rectangle2D.Double body = new Rectangle2D.Double(getX(), getY() + width / 6, width - 1, width / 6);
		
		// Front tire
		Ellipse2D.Double frontTire = new Ellipse2D.Double(getX() + width / 6, getY() + width / 3, width / 6, width / 6);
		
		// Rear tire
		Ellipse2D.Double rearTire = new Ellipse2D.Double(getX() + width * 2 / 3, getY() + width / 3, width / 6,	width / 6);
		
		// Bottom of front windshield
		Point2D.Double r1 = new Point2D.Double(getX() + width / 6, getY() + width / 6);
		
		// Front of roof
		Point2D.Double r2 = new Point2D.Double(getX() + width / 3, getY());
		
		// Rear of roof
		Point2D.Double r3 = new Point2D.Double(getX() + width * 2 / 3, getY());
		
		// Bottom of rear windshield
		Point2D.Double r4 = new Point2D.Double(getX() + width * 5 / 6, getY() + width / 6);
		
		// Connect the bottom of front windshield to front of roof
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		
		// Connect the front of roof to rear of roof
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		
		// Connect the rear of roof to bottom of rear windshield
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
		
		// Assemble the car figure (utilizes add method in superclass)
		add(body);
		add(frontTire);
		add(rearTire);
		add(frontWindshield);
		add(roofTop);
		add(rearWindshield);
	}
}
