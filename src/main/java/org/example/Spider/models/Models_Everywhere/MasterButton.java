package org.example.Spider.models.Models_Everywhere;

import org.example.Spider.Controllers.Screen_controller;
import org.example.Spider.models.Sentences.Check_Sentences_Words;
import org.example.Spider.models.Words.Check_Word;
import org.example.Spider.models.Login.Login_Verification;
import org.example.Spider.models.hado_language.Hado_Translater;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MasterButton {

	Hado_Translater hado = new Hado_Translater();

	Login_Verification login = new Login_Verification();

	Check_Word check = new Check_Word();

	Check_Sentences_Words checkSent = new Check_Sentences_Words();

	private final JButton masterbutton = new JButton();

	Border borderbutton = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);

	public MasterButton(String name, String panelname, Color coler) {
		masterbutton.setText(name);
		masterbutton.setFocusPainted(false);
		masterbutton.setFont(new Font("Arial", Font.PLAIN, 25));
		masterbutton.setForeground(Color.white);
		masterbutton.setBackground(coler);
		masterbutton.setOpaque(true);
		masterbutton.setBorder(borderbutton);
		masterbutton.setPreferredSize(new Dimension(100, 35));

		// Mouse hover effect
		masterbutton.addMouseListener(new MouseAdapter() {
			Color coler = masterbutton.getBackground();

			@Override
			public void mouseEntered(MouseEvent e) {
				super.mouseEntered(e);
				coler = masterbutton.getBackground();
				masterbutton.setBackground(new Color(52, 53, 54));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
				masterbutton.setBackground(coler);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				// Optional: extra click behavior can go here
			}
		});

		// Switch a panel when the button is clicked
		masterbutton.addActionListener(_ -> Screen_controller.showPanel(panelname));
	}

	public JButton getMasterbutton() {
		return masterbutton;
	}

	public void transletActionListener(JTextArea input, JTextArea output) {
		masterbutton.addActionListener(_ -> hado.transform(input, output));
	}

	public void transletRActionListener(JTextArea inputR, JTextArea outputR) {
		masterbutton.addActionListener(_ -> hado.transformR(inputR, outputR));
	}

	public void loginButtonActionListener(JTextField ID, JPasswordField password, JLabel messageLabel) {
		masterbutton.addActionListener(_ -> login.loginVerification(ID, password, messageLabel));
	}

	public void startWords(List<JTextPane> guess) {
		masterbutton.addActionListener(_ -> check.RowsTrue(guess));
	}

	public void startSentences(List<JTextPane> sentences, int p, int q) {
		masterbutton.addActionListener(_ -> checkSent.RowsTrueSentences(sentences, p, q));
	}
}
