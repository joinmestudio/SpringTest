package standalone.collec;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("standalone.collec.xml");
		Collec collec = (Collec)context.getBean("collec");
		System.out.println(collec);
		
		}//need to change in config file
}
