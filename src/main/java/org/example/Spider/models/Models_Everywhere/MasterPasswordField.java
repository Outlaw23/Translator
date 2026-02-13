package org.example.Spider.models.Models_Everywhere;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MasterPasswordField {

	private final JPasswordField passwordField;

	public MasterPasswordField() {
		// Create a dark gray border with thickness 3
		Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);

		// Initialize the password field
		passwordField = new JPasswordField();

		// Set font style and size for the password field
		passwordField.setFont(new Font("Arial", Font.PLAIN, 30));

		// Apply the custom border to the password field
		passwordField.setBorder(bordertextarea);
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}
}
