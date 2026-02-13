package org.example.Spider.models.Models_Everywhere;

import javax.swing.*;
import java.awt.*;

public class MasterLabel {

	JLabel masterLabel = new JLabel();

	public MasterLabel(String text, Color coler) {
		masterLabel.setFont(new Font("Arial", Font.PLAIN, 30)); // set font and size
		masterLabel.setText(text); // set label text
		masterLabel.setForeground(coler); // set text color
	}

	public JLabel getMasterLabel() {
		return masterLabel;
	}
}
