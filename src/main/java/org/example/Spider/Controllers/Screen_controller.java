package org.example.Spider.Controllers;
// MainClass.java

import org.example.Spider.models.Login.User_Data_Login;
import org.example.Spider.view.Learn_Sub_Screens.Picture_Screen.Picture_Explanantion_Screen_view;
import org.example.Spider.view.Learn_Sub_Screens.Picture_Screen.Picture_Learn_Screen_view;
import org.example.Spider.view.Screen_Hado.Hado_Screen_View;
import org.example.Spider.view.Screen_HadoR.HadoR_Screen_View;
import org.example.Spider.view.Screen_Info.Info_Screen_View;
import org.example.Spider.view.Screen_Learn_Hado.Learn_Hado_Screen_View;
import org.example.Spider.view.Learn_Sub_Screens.Sentences_Screens.Sentences_Learn_Screen_view;
import org.example.Spider.view.Learn_Sub_Screens.Words_Screens.Words_Learn_Screen_View;
import org.example.Spider.view.Learn_Sub_Screens.Sentences_Screens.Sentences_Explanantion_Screen_view;
import org.example.Spider.view.Learn_Sub_Screens.Words_Screens.Words_Explanation_Screen_View;
import org.example.Spider.view.Screen_Login.Login_Screen_View;
import org.example.Spider.view.Screen_Main.Main_Screen_View;

import javax.swing.*;
import java.awt.*;


public class Screen_controller {

	private static CardLayout cardLayout;

	private static JPanel mainPanel;

	public static void screenContoller() {


		User_Data_Login user = new User_Data_Login();


		JFrame frame = new JFrame("Main Window");


		frame.setSize(800, 400);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);

		// Create instances of all application screens
		Login_Screen_View login_screen = new Login_Screen_View();
		Main_Screen_View main_screen = new Main_Screen_View();
		Hado_Screen_View hado_screen = new Hado_Screen_View();
		HadoR_Screen_View video_screen = new HadoR_Screen_View();
		Learn_Hado_Screen_View learn_screen = new Learn_Hado_Screen_View();
		Words_Learn_Screen_View words_learn_screen = new Words_Learn_Screen_View();
		Words_Explanation_Screen_View words_explanation_screen = new Words_Explanation_Screen_View();
		Info_Screen_View info_screen = new Info_Screen_View();
		Sentences_Explanantion_Screen_view sentences_explanantion_screen =
				new Sentences_Explanantion_Screen_view();
		Sentences_Learn_Screen_view sentences_learn_screen =
				new Sentences_Learn_Screen_view();
		Picture_Explanantion_Screen_view picture_explanantion_screen_view =
				new Picture_Explanantion_Screen_view();
		Picture_Learn_Screen_view picture_learn_screen_view =
				new Picture_Learn_Screen_view();

		// Register all screens in the CardLayout with unique identifiers
		mainPanel.add(login_screen.Login_screen(user.getUserData()), "screenLogin");
		mainPanel.add(main_screen.screenMain(), "screenMain");
		mainPanel.add(hado_screen.screenHado(), "screenHado");
		mainPanel.add(video_screen.screenHadoR(), "screenHadoR");
		mainPanel.add(learn_screen.Learn_Hado_screen(), "screenLearn");
		mainPanel.add(words_learn_screen.Words_Learn_screen(), "screenWordsLearn");
		mainPanel.add(words_explanation_screen.screenWordsExplanation(), "screenWordsExplanation");
		mainPanel.add(info_screen.screenInfo(), "screenInfo");
		mainPanel.add(sentences_explanantion_screen.screenSentencesExplanation(), "screenSentencesExplanation");
		mainPanel.add(sentences_learn_screen.screenSentencesLearn(), "screenSentencesLearn");
		mainPanel.add(picture_explanantion_screen_view.screenPictureExplanation(), "screenPictureExplanation");
		mainPanel.add(picture_learn_screen_view.picture_Learn_Screen_view(), "pictureLearnScreen");
		// Display the initial screen
		cardLayout.show(mainPanel, "screenMain");


		frame.add(mainPanel);


		frame.setResizable(true);
		frame.setVisible(true);
	}

	public static void showPanel(String panelName) {

		// Show the requested panel using CardLayout
		cardLayout.show(mainPanel, panelName);
	}
}
