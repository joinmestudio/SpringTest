package test1.sud;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		Engine engine = (Engine)context.getBean("engine4");
		System.out.println(engine);
		

	}
}
