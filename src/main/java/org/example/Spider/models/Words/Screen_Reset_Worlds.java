package org.example.Spider.models.Words;

import org.example.Spider.models.Components.Sub_Screens.Components_Words_Screens.Words_Learn_Components;
import org.example.Spider.models.hado_language.HadoLanguageMvc;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.List;

public class Screen_Reset_Worlds {

	public static void resetScreen(
			JPanel panelWords,
			List<JTextPane> guessList,
			JLabel op1Titel,
			JButton resetBtn,
			JButton submitBtn,
			JButton backBtn,
			JButton doneBtn,
			Check_Word checkWord
	) {
		List<String> woorden = List_Maker.newWoords();

		checkWord.fullResetState();

		op1Titel.setText("Guess words");

		resetBtn.setEnabled(true);
		submitBtn.setEnabled(true);
		backBtn.setEnabled(true);
		doneBtn.setEnabled(false);

		panelWords.removeAll();
		for (String wordStr : woorden) {
			JLabel word = Words_Learn_Components.word(wordStr);

			StringBuilder hadoWord = new StringBuilder();
			for (char c : wordStr.toCharArray()) {
				hadoWord.append(HadoLanguageMvc.hadoLanguagee(String.valueOf(c)));
			}

			word.setText(hadoWord.toString());
			panelWords.add(word);
		}

		panelWords.revalidate();
		panelWords.repaint();

		for (JTextPane pane : guessList) {
			pane.setText("");
			pane.setEditable(true);
			pane.setBackground(new Color(55, 64, 54));

			StyledDocument doc = pane.getStyledDocument();
			SimpleAttributeSet black = new SimpleAttributeSet();
			StyleConstants.setForeground(black, Color.BLACK);
			doc.setCharacterAttributes(0, doc.getLength(), black, true);
			pane.setCharacterAttributes(black, true);
		}
	}

}
