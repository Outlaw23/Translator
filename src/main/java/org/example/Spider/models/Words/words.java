package org.example.Spider.models.Words;

import org.example.Spider.Service.WordService;
import org.example.Spider.models.Master_Components.MasterLabel;
import org.example.Spider.models.hado_language.HadoLanguageMvc;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.List;

import static java.awt.Color.white;

@Component
public class words {

	private final WordService wordService;

	public words(WordService wordService) {
		this.wordService = wordService;
	}

	public void getWords(JPanel panelWords) {

		panelWords.removeAll();

		List<String> woorden = wordService.getWords(10);
		System.out.println(woorden + "woorden");

		for (String wordText : woorden) {

			MasterLabel word = new MasterLabel(wordText, white);

			StringBuilder wordlist = new StringBuilder();

			for (char c : wordText.toCharArray()) {
				wordlist.append(HadoLanguageMvc.hadoLanguagee(String.valueOf(c)));
			}

			word.getMasterLabel().setText(wordlist.toString());
			panelWords.add(word.getMasterLabel());
		}

		panelWords.revalidate();
		panelWords.repaint();
	}
}
