package gui.view;

import gui.controller.GUIController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIController appController)
	{
		super(); // has to be super because the class extends JFrame
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800,800);
		this.setTitle("My first Gui");
		this.setResizable(true);
		this.setVisible(true);
	}
	
	
}
