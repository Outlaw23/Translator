package org.example.Spider.view.Screen_Login;

import org.example.Spider.Controllers.Font_Resizer;
import org.example.Spider.Img.Img_Paths;
import org.example.Spider.models.Components.Components_Everywhere;
import org.example.Spider.models.Components.Screens.Login_Screen_Components;
import org.example.Spider.models.Models_Everywhere.MasterImagePanel;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Login_Screen_View extends javax.swing.JPanel {

	public JPanel Login_screen(@SuppressWarnings("unused") HashMap<String, String> userdata) {

		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BorderLayout());
		panelMain.setPreferredSize(new Dimension(1920, 1080));
		panelMain.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
		panelMain.setBackground(new Color(255, 255, 255));

		MasterImagePanel panelMainCenter = new MasterImagePanel(Img_Paths.Background_Spider);
		panelMainCenter.setLayout(new GridLayout(0, 4, 0, 0));
		panelMainCenter.setPreferredSize(new Dimension(1920, 1080));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		panelMainCenter.setBackground(new Color(95, 102, 107));

		MasterImagePanel panelMainNorth = new MasterImagePanel(Img_Paths.Background_Strip);
		panelMainNorth.setLayout(new GridLayout(0, 10, 5, 0));
		panelMainNorth.setPreferredSize(new Dimension(1920, 50));
		panelMainNorth.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
		panelMainNorth.setBackground(new Color(38, 66, 87));

		JPanel panelText = new JPanel();
		panelText.setLayout(new GridLayout(8, 0, 10, 10));
		panelText.setPreferredSize(new Dimension(1920, 500));
		panelText.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 5));
		panelText.setBackground(new Color(95, 102, 107, 0));
		panelText.setOpaque(false);

		JPanel panelFields = new JPanel();
		panelFields.setLayout(new GridLayout(8, 0, 5, 45));
		panelFields.setPreferredSize(new Dimension(1920, 500));
		panelFields.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panelFields.setBackground(new Color(95, 102, 107, 0));
		panelFields.setOpaque(false);

		JLabel title = Components_Everywhere.Title("Login");

		JLabel userID = Login_Screen_Components.userID();
		JLabel userPassword = Login_Screen_Components.userPassword();

		JLabel messageLabel = Login_Screen_Components.messageLabel();

		JTextField ID = Login_Screen_Components.ID();
		JPasswordField password = Login_Screen_Components.password();

		JButton login = Login_Screen_Components.loginButton(ID, password, messageLabel);

		panelMain.add(panelMainNorth, BorderLayout.NORTH);
		panelMain.add(panelMainCenter, BorderLayout.CENTER);

		panelMainNorth.add(title);

		panelMainCenter.add(panelText);
		panelMainCenter.add(panelFields);

		panelText.add(userID);
		panelText.add(userPassword);
		panelText.add(messageLabel);

		panelFields.add(ID);
		panelFields.add(password);
		panelFields.add(login);

		List<JComponent> resizableComponents = Arrays.asList(
				title,
				userID,
				userPassword,
				messageLabel,
				ID,
				password,
				login
		);

		Font_Resizer.applyResizeLogic(panelMain, resizableComponents);

		return panelMain;
	}
}
