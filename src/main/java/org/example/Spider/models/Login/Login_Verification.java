package org.example.Spider.models.Login;

import org.example.Spider.Controllers.Screen_controller;

import javax.swing.*;
import java.awt.*;


public class Login_Verification {

	User_Data_Login LoginData = new User_Data_Login();


	public void loginVerification(JTextField ID, JPasswordField Password, JLabel messageLabel) {

		String userID = ID.getText();

		String password = String.valueOf(Password.getPassword());
		System.out.println(String.valueOf(Password.getPassword()));


		if (LoginData.getUserData().containsKey(userID)) {

			if (LoginData.getUserData().get(userID).equals(password)) {
				messageLabel.setForeground(Color.GREEN);
				messageLabel.setText("Welcome " + userID);
				Screen_controller.showPanel("screenMain");
			} else {
				messageLabel.setForeground(Color.RED);
				messageLabel.setText("wrong password");
			}
			return;
		}


		messageLabel.setForeground(Color.RED);
		messageLabel.setText("user does not exist");
	}
}
