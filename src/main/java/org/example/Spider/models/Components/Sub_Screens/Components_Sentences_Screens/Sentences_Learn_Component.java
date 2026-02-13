package org.example.Spider.models.Components.Sub_Screens.Components_Sentences_Screens;

import org.example.Spider.models.Components.Components_Everywhere;
import org.example.Spider.models.Models_Everywhere.MasterButton;
import org.example.Spider.models.Models_Everywhere.MasterLabel;
import org.example.Spider.models.Models_Everywhere.MasterTextPane;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.gray;


public class Sentences_Learn_Component {

	public static JButton doneButton;
	public static JButton submitbutton;
	public static JButton backButton;
	public static JLabel scoreLabel;


	public static JLabel words() {
		MasterLabel words = new MasterLabel("", Color.white);
		return words.getMasterLabel();
	}

	public static JLabel Sentence(String Sentence) {
		return Components_Everywhere.Title(Sentence);
	}


	public static JTextPane InputBoxes() {
		MasterTextPane inputBoxes = new MasterTextPane("", Color.black);
		return inputBoxes.getMasterTextPane();
	}

	public static JButton submit() {
		if (submitbutton == null) {
			MasterButton Submit = new MasterButton("Submit", "", gray);
			submitbutton = Submit.getMasterbutton();
		}
		return submitbutton;
	}

	public static JButton back() {
		if (backButton == null) {
			MasterButton Back = new MasterButton("Back", "screenSentencesExplanation", gray);
			backButton = Back.getMasterbutton();
		}
		return backButton;
	}

	public static JButton done() {
		if (doneButton == null) {
			MasterButton Done = new MasterButton("Done", "screenLearn", gray);
			doneButton = Done.getMasterbutton();
		}
		return doneButton;
	}

	public static JLabel scoreLabel() {
		if (scoreLabel == null) {
			MasterLabel score = new MasterLabel("", Color.white);
			scoreLabel = score.getMasterLabel();
		}
		return scoreLabel;
	}

}
