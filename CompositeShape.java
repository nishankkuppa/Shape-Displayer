package shapeDisplayer;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;

/**
 * Defines common methods of composite shapes
 * 
 * @author Nishank Kuppa
 *
 */
public class CompositeShape implements CompositeShapeInt
{
	private int xCoordinate;
	private int yCoordinate;
	private ArrayList<Shape> figure = new ArrayList<Shape>();

	public CompositeShape(int xCoordinate, int yCoordinate)
	{
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public int getX()
	{
		return xCoordinate;
	}

	public int getY()
	{
		return yCoordinate;
	}

	public void add(Shape newShape)
	{
		figure.add(newShape);
	}

	public Rectangle getBounds()
	{
		Shape current = figure.get(0);
		Rectangle boundary = current.getBounds();
		return boundary;
	}

	public void draw(Graphics2D g2)
	{
		for (int i = 0; i < figure.size(); i++)
		{
			g2.draw(figure.get(i));
		}
	}

}