package org.example.Spider.models.Components.Screens;

import org.example.Spider.models.Models_Everywhere.MasterButton;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.gray;

public class Learn_Screen_Components {

	public static int numberOpdracht = 0;

	public static List<JButton> opdrachten = new ArrayList<>();

	public static JButton opdrachten() {
		MasterButton opdracht = new MasterButton("assignment " + numberOpdracht, "", gray);
		return opdracht.getMasterbutton();
	}

}
