package test2.sud;

public class Engine {
		float power;

		public float getPower() {
			return power;
		}

		public void setPower(float power) {
			
			System.out.println("power setter is called for power"+power);
			this.power = power;
		}

		public Engine(float power) {
			super();
			this.power = power;
		}
		public Engine() {
			super();
		}

		@Override
		public String toString() {
			return "Engine [power=" + power + "]";
		}
		
		
		
		public void start(){
			System.out.println("engine started with power" +this.power);
		}
		
		
		public void stop(){
			System.out.println("engine stoped with power" +this.power);
		}
		
}
