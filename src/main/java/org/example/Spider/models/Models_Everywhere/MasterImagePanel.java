package org.example.Spider.models.Models_Everywhere;

import javax.swing.*;
import java.awt.*;

public class MasterImagePanel extends JPanel {

	private final Image image;

	public MasterImagePanel(String imagePath) {
		this.image = new ImageIcon(imagePath).getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}
