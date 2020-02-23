package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("c1")
public class Car {
	int model;
	@Autowired
	@Qualifier("e1")
	Engine engine;
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
		System.out.println("car created");
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + "]";
	}

}
