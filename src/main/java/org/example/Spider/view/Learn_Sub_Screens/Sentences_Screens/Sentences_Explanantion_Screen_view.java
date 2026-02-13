package org.example.Spider.view.Learn_Sub_Screens.Sentences_Screens;

import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Img.Img_Paths;
import org.example.Spider.models.Components.Components_Everywhere;
import org.example.Spider.models.Components.Sub_Screens.Components_Sentences_Screens.Sentences_Explanation_Component;
import org.example.Spider.models.Models_Everywhere.MasterImagePanel;
import org.example.Spider.models.Models_Everywhere.MasterPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentences_Explanantion_Screen_view {

	// Holds sentence input rows (used later during learning)
	public static List<List<JTextPane>> rows = new ArrayList<>();


	public JPanel screenSentencesExplanation() {

		MasterPanel panelMain = new MasterPanel("Sentences");

		MasterImagePanel panelMainCenter = new MasterImagePanel(Img_Paths.Background_Spider);
		panelMainCenter.setLayout(new BorderLayout());
		panelMainCenter.setPreferredSize(new Dimension(1920, 500));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		panelMainCenter.setBackground(new Color(95, 102, 107));

		JPanel panelStartButton = new JPanel(new GridLayout(0, 10, 5, 5));
		panelStartButton.setPreferredSize(new Dimension(1920, 60));
		panelStartButton.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
		panelStartButton.setBackground(new Color(95, 102, 107, 0));

		JLabel explanation = Sentences_Explanation_Component.ExplanationSentences();

		JButton Start = Sentences_Explanation_Component.startButtonSentences();
		JButton Back = Components_Everywhere.backButton(Color.gray);

		panelMain.add(panelMainCenter, BorderLayout.CENTER);

		panelMainCenter.add(explanation, BorderLayout.NORTH);
		panelMainCenter.add(panelStartButton, BorderLayout.SOUTH);

		panelStartButton.add(Back);
		panelStartButton.add(Start);

		List<JComponent> resizableComponents = Arrays.asList(
				Back,
				Start,
				explanation
		);

		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}
