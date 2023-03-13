package com.abstrac.classs;

public class CarTest 
{
	public static void main(String[] args) {
		CarType1 ct1 = new CarType1();
		CarType2 ct2 = new CarType2();
		
		
		ct1.carName();
		ct1.seatType();
		System.out.println(ct1.getCargearType());
		ct1.runStatus();
		
		
		ct2.carName();
		ct2.seatType();
		System.out.println(ct2.getCargearType());
		ct2.runStatus();
	}
}
