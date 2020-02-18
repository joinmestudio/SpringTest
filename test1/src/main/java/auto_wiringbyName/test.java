package auto_wiringbyName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("auto_wiringByName.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car);
		//now spring will check the bean class variale name for injection
		//we can create 2 bean of same type for autowiring="byType"
		//and if no bean is found then will inject null
		//
		
		//for constructor based injection use autowire="constructor"
		//it will check the const para type and then search them in config file for matching bean
		}
}
