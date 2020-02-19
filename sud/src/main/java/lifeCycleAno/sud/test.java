package lifeCycleAno.sud;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		///......to enable destroy method
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleAno.xml");
		Engine engine = (Engine)context.getBean("engine1");
		System.out.println(engine);
		context.registerShutdownHook();
		

	}
}
