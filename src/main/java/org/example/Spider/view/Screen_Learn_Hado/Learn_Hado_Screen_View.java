package org.example.Spider.view.Screen_Learn_Hado;

import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Controllers.Screen_controller;
import org.example.Spider.Img.Img_Paths;
import org.example.Spider.models.Components.Screens.Learn_Screen_Components;
import org.example.Spider.models.Models_Everywhere.MasterImagePanel;
import org.example.Spider.models.Models_Everywhere.MasterPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.Spider.models.Components.Screens.Learn_Screen_Components.numberOpdracht;
import static org.example.Spider.models.Components.Screens.Learn_Screen_Components.opdrachten;

public class Learn_Hado_Screen_View {

	public JPanel Learn_Hado_screen() {

		MasterPanel panelMain = new MasterPanel("Learn");

		MasterImagePanel panelMainCenter = new MasterImagePanel(Img_Paths.Background_Spider);
		panelMainCenter.setLayout(new GridLayout(2, 0, 5, 5));
		panelMainCenter.setPreferredSize(new Dimension(1920, 500));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		panelMainCenter.setBackground(new Color(95, 102, 107));

		JPanel panelButtons = new JPanel();
		panelButtons.setLayout(new GridLayout(5, 5, 5, 5));
		panelButtons.setPreferredSize(new Dimension(100, 50));
		panelButtons.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panelButtons.setBackground(new Color(44, 55, 25, 89));

		JPanel panelBriefExplanation = new JPanel();
		panelBriefExplanation.setLayout(new BorderLayout());
		panelBriefExplanation.setPreferredSize(new Dimension(100, 50));
		panelBriefExplanation.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panelBriefExplanation.setBackground(new Color(44, 55, 25, 0));

		for (int i = 0; i < 25; i++) {
			numberOpdracht++;
			JButton opdracht = Learn_Screen_Components.opdrachten();
			opdrachten.add(opdracht);
			panelButtons.add(opdracht);
		}

		opdrachten.getFirst().addActionListener(
				_ -> Screen_controller.showPanel("screenWordsExplanation")
		);

		opdrachten.get(1).addActionListener(
				_ -> Screen_controller.showPanel("screenSentencesExplanation")
		);

		opdrachten.get(2).addActionListener(
				_ -> Screen_controller.showPanel("screenPictureExplanation"));

		opdrachten.getFirst().setToolTipText(
				"<html><b><span style='font-size:15pt;'>Guess Words</span></b></html>"
		);

		opdrachten.get(1).setToolTipText(
				"<html><b><span style='font-size:15pt;'>Place Words</span></b></html>"
		);

		opdrachten.subList(3, 25).forEach(mb -> mb.setEnabled(false));

		panelMain.add(panelMainCenter, BorderLayout.CENTER);

		panelMainCenter.add(panelButtons);
		panelMainCenter.add(panelBriefExplanation);

		List<JComponent> resizableComponents = new ArrayList<>(opdrachten);

		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}
