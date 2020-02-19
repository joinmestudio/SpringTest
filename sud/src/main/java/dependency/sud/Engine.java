package dependency.sud;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Engine{
	
		//@Required we cant put @required at fields can use only at setter methods 
		float power;

		public float getPower() {
			return power;
		}

		@Required //we have to enable the @required in config file
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
		
		
}
