package autowiring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	String model;
	@Autowired
	@Qualifier("engine1")//use it with autowire for specific bean
	Engine engine;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	//@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	//@Autowired //we cant do this 
	public Car( Engine engine,String model) {
		super();
		this.model = model;
		this.engine = engine;
	}
	public Car() {
		
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + "]";
	}
	
	
}
