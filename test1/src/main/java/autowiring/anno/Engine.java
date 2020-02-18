package autowiring.anno;

public class Engine {
	int serial;
	int power;
	
	
	
	public int getSerial() {
		return serial;
	}
	
	
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Engine [serial=" + serial + ", power=" + power + "]";
	}
	public Engine(int serial, int power) {
		super();
		this.serial = serial;
		this.power = power;
	}
	public Engine() {
	}
	

}
