package annotation.sud;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Engine{
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
		
		
		
		
		@PostConstruct
		public void start(){
			System.out.println("engine started with power" +this.power);
		}
		
		@PreDestroy
		public void stop(){
			System.out.println("engine stop with power" +this.power);
		}
		

}
