package com.wolken.wolkenapp.led;

import com.wolken.wolkenapp.iswitch.ISwitch;
//implementation  class contain implementation objects 
public class LedImpl implements ISwitch {

	@Override
	public void sOn() {
		// TODO Auto-generated method stub
		System.out.println("Led light is ON");
	}

	@Override
	public void sOff() {
		// TODO Auto-generated method stub
		System.out.println("Led light is OFF");
		
	}
	

}
