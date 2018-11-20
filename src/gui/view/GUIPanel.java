package gui.view;

import gui.controller.GUIController;
import javax.swing.JPanel;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	
	public GUIPanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}