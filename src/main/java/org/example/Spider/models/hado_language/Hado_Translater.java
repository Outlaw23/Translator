package org.example.Spider.models.hado_language;

import javax.swing.*;


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
}
