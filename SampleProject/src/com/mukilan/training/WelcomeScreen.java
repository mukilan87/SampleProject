package com.mukilan.training;

import java.text.Format;
import java.util.Scanner;

public class WelcomeScreen {

	public WelcomeScreen() {Scanner toscan = new Scanner(System.in);
	System.out.print("User Name : ");
	String userName  = toscan.nextLine();
	System.out.println("------------------------------------------------------------");
		String stringfor = String.format("Welcome %s",userName);
		System.out.println(stringfor);
	}

	public static void main(String[] args) {
		WelcomeScreen welcome = new WelcomeScreen();
	}

}
