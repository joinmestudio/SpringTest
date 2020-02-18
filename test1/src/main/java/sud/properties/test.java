package sud.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("properties.xml");
		Engine engine = (Engine)context.getBean("engine");
		System.out.println(engine);
		
	}
}
