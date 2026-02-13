package org.example.Spider.models.Components.Sub_Screens.Components_Sentences_Screens;

import org.example.Spider.models.Models_Everywhere.MasterButton;
import org.example.Spider.models.Models_Everywhere.MasterLabel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.gray;
import static java.awt.Color.white;


public class Sentences_Explanation_Component {

	public static List<JTextPane> inputBoxesList = new ArrayList<>();

	public static int rowIndex = 0;

	public static int rowEndindex = 0;

	public static JLabel ExplanationSentences() {
		MasterLabel explanation = new MasterLabel(
				"<html><font size=30>Sentence Explanation</font><br/>" +
						"<html><font size=6>" +
						"Build sentences using Hado words.<br/><br/>" +

						"At the top, words are shown like this:<br/>" +
						"word || word || word<br/><br/>" +

						"Each part is one sentence.<br/>" +
						"Do NOT type || in the text area.<br/><br/>" +

						"Inside a sentence, connect words using &.<br/>" +
						"You may type word&word or word & word (no quotation marks).<br/><br/>" +

						"Rules:<br/>" +
						"- 1 to 3 words per sentence<br/>" +
						"- Use & when there is more than one word<br/>" +
						"- Only type words and &<br/><br/>" +

						"Enter one sentence per line." +
						"</font></html>",
				white
		);
		return explanation.getMasterLabel();
	}

	public static JButton startButtonSentences() {
		MasterButton Start = new MasterButton("Start", "screenSentencesLearn", gray);

		// Initialize the Sentences game with required data
		Start.startSentences(inputBoxesList, rowIndex, rowEndindex);

		return Start.getMasterbutton();
	}

}
