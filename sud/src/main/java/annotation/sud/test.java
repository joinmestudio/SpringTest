package annotation.sud;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		///......to enable annotation just for lifecycle method using config file
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		Engine engine = (Engine)context.getBean("engine1");
		System.out.println(engine);
		context.registerShutdownHook();
		
		

	}
}
