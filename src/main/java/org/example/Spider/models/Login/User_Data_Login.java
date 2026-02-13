package org.example.Spider.models.Login;

import java.util.HashMap;

public class User_Data_Login {


	HashMap<String, String> userData = new HashMap<>();

	public User_Data_Login() {
		userData.put("Spider", "Code14");
		userData.put("Outlaw", "Code19");
		userData.put("Mandy", "Code24");
	}

	public HashMap<String, String> getUserData() {
		return userData;
	}
}
