package sud.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("const1.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car);
		
		//	<constructor-arg index="1" type="Model" name="model" value="sud"/>
		//  <constructor-arg index="2" type="String" name="engine" ref="engine" />
	}
}
