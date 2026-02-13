package org.example.Spider.models.Models_Everywhere;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MasterTextArea {

	private static JTextArea masterTextArea;
	private static JTextArea input;
	private static JTextArea output;
	private static JTextArea inputR;
	private static JTextArea outputR;
	private static JTextArea ID;
	private static JTextArea password;
	private static JTextArea briefExplanation;
	private static JTextArea description;
	private static JTextArea example;

	public MasterTextArea() {
		if (masterTextArea == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			masterTextArea = new JTextArea();
			masterTextArea.setFont(new Font("Arial", Font.PLAIN, 25));
			masterTextArea.setBorder(bordertextarea);
		}

		if (input == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			input = new JTextArea();
			input.setFont(new Font("Arial", Font.PLAIN, 25));
			input.setBorder(bordertextarea);
		}

		if (output == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			output = new JTextArea();
			output.setFont(new Font("Arial", Font.PLAIN, 25));
			output.setBorder(bordertextarea);
			output.setEditable(false);
		}

		if (inputR == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			inputR = new JTextArea();
			inputR.setFont(new Font("Arial", Font.PLAIN, 25));
			inputR.setBorder(bordertextarea);
		}

		if (outputR == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			outputR = new JTextArea();
			outputR.setFont(new Font("Arial", Font.PLAIN, 25));
			outputR.setBorder(bordertextarea);
			outputR.setEditable(false);
		}

		if (ID == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			ID = new JTextArea();
			ID.setFont(new Font("Arial", Font.PLAIN, 25));
			ID.setBorder(bordertextarea);
		}

		if (password == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			password = new JTextArea();
			password.setFont(new Font("Arial", Font.PLAIN, 25));
			password.setBorder(bordertextarea);
		}

		if (briefExplanation == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			briefExplanation = new JTextArea();
			briefExplanation.setFont(new Font("Arial", Font.PLAIN, 25));
			briefExplanation.setBorder(bordertextarea);
		}

		if (description == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			description = new JTextArea();
			description.setFont(new Font("Arial", Font.PLAIN, 25));
			description.setBorder(bordertextarea);
		}
		if (example == null) {
			Border bordertextarea = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
			example = new JTextArea();
			example.setFont(new Font("Arial", Font.PLAIN, 25));
			example.setBorder(bordertextarea);
		}
	}

	public JTextArea gettextinput() {
		return input;
	}

	public JTextArea gettextoutput() {
		return output;
	}

	public JTextArea gettextinputR() {
		return inputR;
	}

	public JTextArea gettextoutputR() {
		return outputR;
	}
	
	public JTextArea getDescription() {
		return description;
	}

	public JTextArea getExample() {
		return example;
	}
}
