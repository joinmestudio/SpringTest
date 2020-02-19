package test2.sud;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		///......to enable destroy method by xml config
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		Engine engine = (Engine)context.getBean("engine1");
		System.out.println(engine);
		context.registerShutdownHook();
		

	}
}
