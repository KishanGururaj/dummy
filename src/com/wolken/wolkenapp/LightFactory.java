package com.wolken.wolkenapp;

import com.wolken.wolkenapp.iswitch.ISwitch;
import com.wolken.wolkenapp.led.LedImpl;
import com.wolken.wolkenapp.tubelight.TubelightImpl;
//factory class -object creation logic 
public class LightFactory {
	public static ISwitch getLight(String type) {
		if (type.equalsIgnoreCase("tubelight")) {
			return new TubelightImpl();
		}
		else if (type.equalsIgnoreCase("Ledlight")) {
			return new LedImpl();
		}
		else {
			System.out.println("No light found");
		}
		return null;
	}

}
