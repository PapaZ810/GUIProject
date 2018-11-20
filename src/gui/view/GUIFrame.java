package gui.view;

import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	
	public GUIFrame()
	{
		super(); // has to be super because the class extends JFrame
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(800,800);
		this.setTitle("My first Gui");
		this.setResizable(true);
		this.setVisible(true);
	}
	
	
}
