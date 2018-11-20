package gui.view;

import gui.controller.GUIController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIController appController)
	{
		super();
		
		appLayout = new SpringLayout();
		firstLabel = new JLabel("Words");
		firstButton = new JButton("Click");
		
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void changeBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH,  firstLabel, 70, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST,  firstLabel, -90, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST,  firstLabel, 175, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH,  firstLabel, -135, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseCLick)
			{
				changeBackground();
			}
		});
	}
	
}