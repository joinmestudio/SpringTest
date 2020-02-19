package lifeCycleAno.sud;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Engine implements InitializingBean,DisposableBean{
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

		@Override
		public void destroy() throws Exception {
			System.out.println("engine stoped with power" +this.power);
			
		}

		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("engine started with power" +this.power);
			
		}
		
		

}
