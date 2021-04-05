package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.iswitch.ISwitch;

public class LightUtil {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String type =scanner.next();
		ISwitch iswitch =LightFactory. getLight(type);
		iswitch.sOn();
		iswitch.sOff();
		scanner.close();
	}

}
