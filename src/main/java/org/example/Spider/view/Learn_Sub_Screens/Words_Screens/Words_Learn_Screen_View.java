package org.example.Spider.view.Learn_Sub_Screens.Words_Screens;

import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Controllers.Screen_controller;
import org.example.Spider.Pahts.Img_Paths;
import org.example.Spider.Service.WordService;
import org.example.Spider.models.Components.Sub_Screens.Components_Words_Screens.Words_Learn_Components;
import org.example.Spider.models.Master_Components.MasterImagePanel;
import org.example.Spider.models.Master_Components.MasterPanel;
import org.example.Spider.models.Words.Check_Word;
import org.example.Spider.models.Words.Screen_Reset_Words;
import org.example.Spider.models.Words.words;
import org.example.Spider.models.hado_language.HadoLanguageMvc;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.Spider.models.Components.Sub_Screens.Components_Words_Screens.Words_Explanation_Components.GuessList;

@Component
public class Words_Learn_Screen_View {


	private final words words;
	private final Screen_Reset_Words resetWords;
	private final Check_Word check;
	private final WordService wordService;


	public Words_Learn_Screen_View(words words,
								   Screen_Reset_Words resetWords,
								   Check_Word check,
								   WordService wordService) {
		this.words = words;
		this.resetWords = resetWords;
		this.check = check;
		this.wordService = wordService;
	}

	public JPanel Words_Learn_screen() {


		MasterPanel panelMain = new MasterPanel("Words");
		panelMain.buttondisable();

		MasterImagePanel panelMainCenter = new MasterImagePanel(Img_Paths.background_Spider_2);
		panelMainCenter.setLayout(new BorderLayout());
		panelMainCenter.setPreferredSize(new Dimension(1920, 500));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		panelMainCenter.setBackground(new Color(95, 102, 107));

		JPanel paneltop = new JPanel();
		paneltop.setLayout(new BorderLayout());
		paneltop.setPreferredSize(new Dimension(1920, 75));
		paneltop.setBorder(BorderFactory.createEmptyBorder(15, 30, 15, 30));
		paneltop.setBackground(new Color(52, 62, 69, 0));
		paneltop.setOpaque(false);


		JPanel panelTopLabel = new JPanel();
		panelTopLabel.setLayout(new BorderLayout());
		panelTopLabel.setPreferredSize(new Dimension(450, 50));
		panelTopLabel.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));
		panelTopLabel.setBackground(new Color(52, 62, 69, 0));
		panelTopLabel.setOpaque(false);


		JPanel panelTopButtons = new JPanel();
		panelTopButtons.setLayout(new GridLayout(0, 4, 5, 5));
		panelTopButtons.setPreferredSize(new Dimension(550, 50));
		panelTopButtons.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));
		panelTopButtons.setBackground(new Color(52, 62, 69, 0));

		JPanel panelWords = new JPanel();
		panelWords.setLayout(new GridLayout(10, 0, 5, 5));
		panelWords.setPreferredSize(new Dimension(220, 50));
		panelWords.setBorder(BorderFactory.createEmptyBorder(5, 55, 5, 30));
		panelWords.setBackground(new Color(75, 89, 74, 0));
		panelWords.setOpaque(false);

		JPanel panelInput = new JPanel();
		panelInput.setLayout(new GridLayout(10, 6, 5, 5));
		panelInput.setPreferredSize(new Dimension(1920, 75));
		panelInput.setBorder(BorderFactory.createEmptyBorder(15, 30, 15, 30));
		panelInput.setBackground(new Color(75, 89, 74, 0));

		JLabel op1Titel = Words_Learn_Components.op1Titel();

		List<String> woorden = wordService.getWords(10);
		System.out.println(woorden);
		List<JLabel> wordList = new ArrayList<>();

		for (String words : woorden) {
			JLabel word = Words_Learn_Components.word(words);

			StringBuilder wordlist = new StringBuilder();
			for (char c : words.toCharArray()) {
				wordlist.append(HadoLanguageMvc.hadoLanguagee(String.valueOf(c)));
				wordList.add(word);
			}
			word.setText(wordlist.toString());
			panelWords.add(word);
		}

		JButton back = Words_Learn_Components.back();

		JButton reset = Words_Learn_Components.reset();
		reset.addActionListener(e -> words.getWords(panelWords));

		JButton submit = Words_Learn_Components.submit();
		submit.addActionListener(e -> check.checkWord(GuessList));

		JButton done = Words_Learn_Components.done();
		done.addActionListener(e ->
				resetWords.resetScreen(
						panelWords,
						GuessList,
						op1Titel,
						reset,
						submit,
						back,
						done,
						check
				)
		);
		done.addActionListener(e -> Screen_controller.showPanel("screenLearn"));
		done.setEnabled(false);

		for (int i = 0; i < 60; i++) {
			JTextPane guess = Words_Learn_Components.textPane();
			GuessList.add(guess);
			panelInput.add(guess);
			guess.setEditable(false);
			guess.setBackground(new Color(55, 64, 54));
		}

		panelMain.add(panelMainCenter, BorderLayout.CENTER);


		panelMainCenter.add(paneltop, BorderLayout.NORTH);
		panelMainCenter.add(panelWords, BorderLayout.WEST);
		panelMainCenter.add(panelInput, BorderLayout.CENTER);

		paneltop.add(panelTopLabel, BorderLayout.EAST);
		paneltop.add(panelTopButtons, BorderLayout.WEST);

		panelTopButtons.add(back);
		panelTopButtons.add(reset);
		panelTopButtons.add(submit);
		panelTopButtons.add(done);

		panelTopLabel.add(op1Titel, BorderLayout.CENTER);

		List<JComponent> resizableComponents = new ArrayList<>();
		resizableComponents.add(back);
		resizableComponents.add(reset);
		resizableComponents.add(op1Titel);
		resizableComponents.add(submit);
		resizableComponents.add(done);
		resizableComponents.addAll(GuessList);
		resizableComponents.addAll(wordList);

		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}
