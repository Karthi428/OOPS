package com.interace.abstrac;

public class BikeTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GearBike gb = new GearBike();
		NonGearbike ngb = new NonGearbike();
		
		gb.turnonBike();
		gb.turnoffBike();
		System.out.println("The Bike type is "+gb.getBiketype());
		
		ngb.turnonBike();
		ngb.turnoffBike();
		ngb.getBiketype();
		System.out.println("The Bike type is "+ngb.getBiketype());

	}

}
