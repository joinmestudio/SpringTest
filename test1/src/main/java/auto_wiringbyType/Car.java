package auto_wiringbyType;

public class Car {

	String model;
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
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Car(String model, Engine engine) {
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
