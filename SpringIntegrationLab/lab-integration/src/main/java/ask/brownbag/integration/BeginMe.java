package ask.brownbag.integration;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeginMe {

	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/integration.xml");
	}
}
