package auto_wiringbyType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("auto_wiringbyType.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car);
		//we cant create 2 bean of same type for autowiring="byType"
		//and if no bean is found then will inject null
		//
		}
}
