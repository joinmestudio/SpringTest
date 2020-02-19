package annotation1.sud;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		///......to enable all annotation using config file
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotation1.xml");
		Engine engine = (Engine)context.getBean("engine1");
		System.out.println(engine);
		context.registerShutdownHook();
		
		

	}
}
