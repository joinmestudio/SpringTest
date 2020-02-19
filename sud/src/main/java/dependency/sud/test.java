package dependency.sud;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		// change scope ofbean  using (scope="prototype") in config file
		///......to enable all annotation using config file (use RequiredAnnotationBeanPostProcessor )
		/*
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("dependency.xml");
		Engine engine = (Engine)context.getBean("engine1");
		System.out.println(engine);
		context.registerShutdownHook();
		*/
		
		
		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("dependency.xml");
		Car car = (Car)context1.getBean("car");
		System.out.println(car);
		context1.registerShutdownHook();
		
		

	}
}
