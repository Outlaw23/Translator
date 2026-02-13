package org.example.Spider.view.Screen_Main;


import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Img.Img_Paths;
import org.example.Spider.models.Components.Screens.Main_Screen_Components;
import org.example.Spider.models.Models_Everywhere.MasterImagePanel;
import org.example.Spider.models.Models_Everywhere.MasterPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main_Screen_View {

	public JPanel screenMain() {

		MasterPanel panelMain = new MasterPanel("home");

		MasterImagePanel panelMainCenter = new MasterImagePanel(Img_Paths.Background_Spider);
		panelMainCenter.setLayout(new GridLayout(6, 0, 5, 5));
		panelMainCenter.setPreferredSize(new Dimension(1920, 500));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		panelMainCenter.setBackground(new Color(95, 102, 107));

		JLabel hadoScreen = Main_Screen_Components.hadoLabel();
		JLabel hadoRScreen = Main_Screen_Components.hadoRLabel();

		panelMain.add(panelMainCenter, BorderLayout.CENTER);

		panelMainCenter.add(hadoScreen);
		panelMainCenter.add(hadoRScreen);

		List<JComponent> resizableComponents = Arrays.asList(
				hadoScreen,
				hadoRScreen
		);
		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}

