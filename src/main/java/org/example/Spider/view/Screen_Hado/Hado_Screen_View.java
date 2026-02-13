package org.example.Spider.view.Screen_Hado;

import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Img.Img_Paths;
import org.example.Spider.models.Components.Screens.Hado_Screen_Components;
import org.example.Spider.models.Models_Everywhere.MasterImagePanel;
import org.example.Spider.models.Models_Everywhere.MasterPanel;
import org.example.Spider.models.Models_Everywhere.MasterScrollPane;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Hado_Screen_View {

	public JPanel screenHado() {

		MasterPanel panelMain = new MasterPanel("Hado");

		MasterImagePanel panelHadoCenter = new MasterImagePanel(Img_Paths.background_Spider_2);
		panelHadoCenter.setLayout(new BorderLayout());
		panelHadoCenter.setPreferredSize(new Dimension(1920, 500));
		panelHadoCenter.setBorder(BorderFactory.createEmptyBorder(5, 50, 50, 50));
		panelHadoCenter.setBackground(new Color(95, 102, 107));

		JPanel panelHadoButtons = new JPanel();
		panelHadoButtons.setLayout(new GridLayout(0, 9, 5, 0));
		panelHadoButtons.setPreferredSize(new Dimension(1920, 50));
		panelHadoButtons.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panelHadoButtons.setBackground(new Color(95, 102, 107, 0));

		JPanel panelHadoText = new JPanel();
		panelHadoText.setLayout(new GridLayout(2, 0, 15, 15));
		panelHadoText.setPreferredSize(new Dimension(1920, 50));
		panelHadoText.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panelHadoText.setBackground(new Color(95, 102, 107, 0));

		JTextArea input = Hado_Screen_Components.input();

		JTextArea output = Hado_Screen_Components.output();

		JButton translate = Hado_Screen_Components.translate();

		panelMain.add(panelHadoCenter, BorderLayout.CENTER);

		panelHadoCenter.add(panelHadoButtons, BorderLayout.NORTH);
		panelHadoCenter.add(panelHadoText, BorderLayout.CENTER);

		panelHadoButtons.add(translate);

		MasterScrollPane masterScroll = new MasterScrollPane(input);
		MasterScrollPane masterScroll1 = new MasterScrollPane(output);
		panelHadoText.add(masterScroll.getScrollPane());
		panelHadoText.add(masterScroll1.getScrollPane());

		List<JComponent> resizableComponents = Arrays.asList(
				translate,
				input,
				output
		);

		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}
