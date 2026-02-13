package org.example.Spider.view.Learn_Sub_Screens.Words_Screens;

import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Img.Img_Paths;
import org.example.Spider.models.Components.Components_Everywhere;
import org.example.Spider.models.Components.Sub_Screens.Components_Words_Screens.Words_Explanation_Components;
import org.example.Spider.models.Models_Everywhere.MasterImagePanel;
import org.example.Spider.models.Models_Everywhere.MasterPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;


public class Words_Explanation_Screen_View {

	public JPanel screenWordsExplanation() {

		MasterPanel panelMain = new MasterPanel("Words");

		MasterImagePanel panelMainCenter = new MasterImagePanel(Img_Paths.Background_Spider);
		panelMainCenter.setLayout(new BorderLayout());
		panelMainCenter.setPreferredSize(new Dimension(1920, 500));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		panelMainCenter.setBackground(new Color(95, 102, 107));

		JPanel panelStartButton = new JPanel();
		panelStartButton.setLayout(new GridLayout(0, 10, 5, 5));
		panelStartButton.setPreferredSize(new Dimension(1920, 60));
		panelStartButton.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
		panelStartButton.setBackground(new Color(95, 102, 107, 0));

		JLabel explanation = Words_Explanation_Components.ExplanationWords();

		JButton Start = Words_Explanation_Components.startButtonWords();
		JButton Back = Components_Everywhere.backButton(Color.gray);

		panelMain.add(panelMainCenter, BorderLayout.CENTER);

		panelMainCenter.add(panelStartButton, BorderLayout.SOUTH);
		panelMainCenter.add(explanation, BorderLayout.NORTH);

		panelStartButton.add(Back);
		panelStartButton.add(Start);

		List<JComponent> resizableComponents = Arrays.asList(
				Start,
				Back,
				explanation
		);

		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}
