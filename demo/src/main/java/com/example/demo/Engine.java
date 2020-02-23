package com.example.demo;

import org.springframework.stereotype.Component;

@Component("e1")
public class Engine {
	float power;

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + "]";
	}

	public Engine(float power) {
		super();
		this.power = power;
	}

	public Engine() {
		System.out.println("Engine created");
	}

	public void run() {
		System.out.println("Engine started");

	}
}
