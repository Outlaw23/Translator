package org.example.Spider.models.hado_language;

import org.example.Spider.models.Words.List_Maker;
import org.example.Spider.models.Models_Everywhere.MasterLabel;

import javax.swing.*;
import java.util.List;

import static java.awt.Color.white;

public class Hado_Translater {

	public void transform(JTextArea input, JTextArea output) {
		String text = input.getText();
		StringBuilder translator = new StringBuilder();

		for (char c : text.toCharArray()) {
			translator.append(HadoLanguageMvc.hadoLanguagee(String.valueOf(c)));
		}

		output.setText(translator.toString());
	}

	public void transformR(JTextArea inputR, JTextArea outputR) {
		String text = inputR.getText();
		StringBuilder translator = new StringBuilder();

		for (char c : text.toCharArray()) {
			translator.append(HadoLanguageMvc.reverseHadoLanguage(String.valueOf(c)));
		}

		outputR.setText(translator.toString());
	}

	public void getWords(JPanel panelWords) {
		panelWords.removeAll();
		List<String> woorden = List_Maker.newWoords();

		for (String words : woorden) {
			MasterLabel word = new MasterLabel(words, white);

			StringBuilder wordlist = new StringBuilder();
			for (char c : words.toCharArray()) {
				wordlist.append(HadoLanguageMvc.hadoLanguagee(String.valueOf(c)));
			}

			word.getMasterLabel().setText(wordlist.toString());
			panelWords.add(word.getMasterLabel());
		}

		panelWords.revalidate();
		panelWords.repaint();
	}
}
