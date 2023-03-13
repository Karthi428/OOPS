package com.abstrac.classs;

public class CarType2 extends Car {

	private String carname = "Mahindra";
	private String seattype = "7 Seater";
	private String geartype = "Manual";
	
	
	@Override
	public void carName() {
		// TODO Auto-generated method stub
		System.out.println("Car name is "+ carname);
	}

	@Override
	public void seatType() {
		// TODO Auto-generated method stub
		System.out.println("Car Seat Type is "+ seattype);
	}

	@Override
	public String getCargearType() {
		// TODO Auto-generated method stub
		return this.geartype;
	}
}
