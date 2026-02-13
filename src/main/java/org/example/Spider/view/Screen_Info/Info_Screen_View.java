package org.example.Spider.view.Screen_Info;

import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Img.Img_Paths;
import org.example.Spider.models.Components.Screens.Info_Screen_Components;
import org.example.Spider.models.Models_Everywhere.MasterImagePanel;
import org.example.Spider.models.Models_Everywhere.MasterPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Info_Screen_View {

	public JPanel screenInfo() {

		MasterPanel panelMain = new MasterPanel("Info");

		MasterImagePanel panelMainCenter = new MasterImagePanel(Img_Paths.Background_Spider);
		panelMainCenter.setLayout(new BorderLayout());
		panelMainCenter.setPreferredSize(new Dimension(1920, 500));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		panelMainCenter.setBackground(new Color(95, 102, 107));

		JLabel infoText = Info_Screen_Components.infoLabel();

		panelMain.add(panelMainCenter, BorderLayout.CENTER);

		panelMainCenter.add(infoText, BorderLayout.NORTH);

		List<JComponent> resizableComponents = List.of(
				infoText
		);

		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}
