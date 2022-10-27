package com.app.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tyre tire;

	public Tyre getTire() {
		return tire;
	}

	public void setTire(Tyre tire) {
		this.tire = tire;
	}

	public void drive() {
		System.out.println("Car......! " + tire);
	}
}
