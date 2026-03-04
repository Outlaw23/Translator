package org.example.Spider.models.Master_Components;

import javax.swing.*;
import java.awt.*;

public class MasterTextPane {

	JTextPane masterTextPane = new JTextPane();

	public MasterTextPane(String text, Color coler) {
		masterTextPane.setFont(new Font("Arial", Font.PLAIN, 30)); // set font and size
		masterTextPane.setText(text); // set text
		masterTextPane.setForeground(coler); // set text color
	}

	public JTextPane getMasterTextPane() {
		return masterTextPane;
	}
}
