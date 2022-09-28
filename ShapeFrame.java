package shapeDisplayer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * The ShapeFrame class is a JFrame. A ShapeFrame has a Box and a Panel. The Box
 * is a container of Buttons with icons on the top of them. The Panel is what
 * you click on with mouse to paint the current shape. The addShape method of
 * the ShapeFrame will take a CompositeShape and adds a button with the icon of
 * the CompositeShape to the Box.
 * 
 * @author Nishank Kuppa
 *
 */
public class ShapeFrame extends JFrame
{

	private static final long serialVersionUID = 1L;
	public static final int BUTTON_WIDTH = 25;
	public static final int BUTTON_HEIGHT = 40;

	private MainPanel shapePanel; 		// where the composite shapes are displayed
	private Box buttonPanel;		    // where the buttons are displayed
 
	public ShapeFrame()
	{
		// Place the buttons on the top of the frame
		buttonPanel = Box.createHorizontalBox();
		add(buttonPanel, BorderLayout.NORTH);
		
		// Place the panel in the center of the frame
		shapePanel = new MainPanel();
		add(shapePanel, BorderLayout.CENTER);
	}

	/**
	 * Takes a composite shape and adds a button with the icon of that composite
	 * shape to that box. Also, the addShape method associates an event handler with
	 * the button in a way that when the user clicks on the button, the
	 * corresponding action is taken placed. For example, when the user clicks on
	 * the button, the corresponding shape becomes the current shape.
	 * 
	 * @param newShape
	 */
	public void addShape(CompositeShape newShape)
	{
		// Create buttons containing each icon
		JButton iconButton = new JButton(new ShapeIcon(newShape, BUTTON_WIDTH, BUTTON_HEIGHT));

		iconButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// System.out.println("Changed Icon");
				shapePanel.setShape(newShape);
			}
		});

		buttonPanel.add(iconButton);
	}

}
