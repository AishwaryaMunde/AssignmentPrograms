package com.bridgelabz.SpringIOC;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	public void drive()
	{
		System.out.println("This is Bike");
	}
}
