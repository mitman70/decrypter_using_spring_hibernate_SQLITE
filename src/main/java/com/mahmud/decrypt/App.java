package com.mahmud.decrypt;

/*****
 * 	Farrukh Mahmud
 *  Looks like a Shelock Holmes novel I'm guessing A Study in Scarlet
 * 
 ****/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahmud.decrypt.service.IDecrypterService;






public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		
		App app = new App();
		app.startService(context);
		
	}
	
	
	private void startService(ApplicationContext context)
	{
		
 
		IDecrypterService service = (IDecrypterService) context.getBean("decrypterService");
		
		System.out.print(service.decryptBook());
		
	}
	
	
}
