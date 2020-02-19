package test1.sud;

public class Vehical {
	String type;
	int wheel;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public Vehical(String type, int wheel) {
		super();
		this.type = type;
		this.wheel = wheel;
	}
	@Override
	public String toString() {
		return "Vehical [type=" + type + ", wheel=" + wheel + "]";
	}
	
}
