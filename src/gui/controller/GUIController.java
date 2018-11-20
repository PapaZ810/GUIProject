package gui.controller;

import gui.model.Duck;
import gui.view.GUIFrame;

public class GUIController
{
	private Duck myDuck;
	private GUIFrame appFrame;
	
	public GUIController()
	{
		myDuck = new Duck();
		
		appFrame = new GUIFrame(this);
	}
	
	
	public void start()
	{
		
	}
}
