package com.interace.abstrac;

public class GearBike implements Bike{
	
	private String biketype = "GearBike";

	@Override
	public void turnonBike() {
		// TODO Auto-generated method stub
		System.out.println("Turn on the Gear Bike");
	}

	@Override
	public void turnoffBike() {
		// TODO Auto-generated method stub
		System.out.println("Turn off the Gear Bike");
	}

	@Override
	public String getBiketype() {
		// TODO Auto-generated method stub
		return this.biketype;
	}

}
