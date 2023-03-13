package com.interace.abstrac;

public class NonGearbike implements Bike {
	
	private String biketype = "Non-Gear Bike";

	@Override
	public void turnonBike() {
		// TODO Auto-generated method stub
		System.out.println("Turn on the Non-Gear Bike");
	}

	@Override
	public void turnoffBike() {
		// TODO Auto-generated method stub
		System.out.println("Turn off the Non-Gear Bike");
	}

	@Override
	public String getBiketype() {
		// TODO Auto-generated method stub
		return this.biketype;
	}


}
