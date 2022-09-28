package shapeDisplayer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * The Panel is a special panel: not only it knows how to paint the current
 * shape on the panel; it also maintains all previously drawn shapes on the
 * panel. For instance, in the example figure on this document, there are 7
 * shapes already drawn in the panel. The panel should remember these composite
 * shapes along with their locations. By doing so, when the next shape, the 8th
 * one, is drawn, it can still paint the previous 7 shapes at the same locations
 * as they were shown before.
 * 
 * @author Nishank Kuppa
 *
 */

public class MainPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private CompositeShape currentShape;
	private ArrayList<LocationAndShape> shapes;

	public MainPanel()
	{
		shapes = new ArrayList<LocationAndShape>();

		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				Point2D mousePoint = e.getPoint();
				shapes.add(new LocationAndShape(mousePoint, currentShape));
				repaint();
			}
		});
	}

	public void setShape(CompositeShape newShape)
	{
		setCurrentShape(newShape);
	}

	public CompositeShape getCurrentShape()
	{
		return currentShape;
	}

	public void setCurrentShape(CompositeShape currentShape)
	{
		this.currentShape = currentShape;
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		for (int i = 0; i < shapes.size(); i++)
		{
			LocationAndShape currentShape = shapes.get(i);
			currentShape.draw(g2);
		}
	}

}