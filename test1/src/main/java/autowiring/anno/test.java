package autowiring.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring.anno.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car);
		// work as "byName"
		}
}
