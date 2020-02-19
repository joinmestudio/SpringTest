package dependency.sud;

public class Car {
		Engine engine;
		String model;
		int serialno;
		public Engine getEngine() {
			return engine;
		}
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getSerialno() {
			return serialno;
		}
		public void setSerialno(int serialno) {
			this.serialno = serialno;
		}
		public Car(Engine engine, String model, int serialno) {
			super();
			this.engine = engine;
			this.model = model;
			this.serialno = serialno;
		}
		public Car() {
			super();
			
		}
		@Override
		public String toString() {
			return "Car [engine=" + engine + ", model=" + model + ", serialno=" + serialno + "]";
		}
		
}
