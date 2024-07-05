package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entities.Address;
import com.entities.Employee;
import com.entities.PermanentAddress;
import com.entities.ResidentialAddress;
import com.service.GreetingServiceImpl;

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		//context.scan("com");
		//context.refresh();
		GreetingServiceImpl greetingService = context.getBean(GreetingServiceImpl.class);
		System.out.println(greetingService.sayGreeting());
		System.out.println("----------------------------------");
		
		Employee employee = (Employee) context.getBean("emp");
		System.out.println("employee : "+employee);
		
		Employee employee1 = (Employee) context.getBean("emp");
		System.out.println("employee==employee1 : "+(employee==employee1));
		System.out.println("-----------------------------------");
		
		PermanentAddress permanent = context.getBean(PermanentAddress.class);
		PermanentAddress permanent1 = context.getBean(PermanentAddress.class);
		System.out.println("permanent==permanent1 : "+(permanent==permanent1));
		
		context.close();
	}
}

/*
 
 the ApplicationContext is the central interface for providing configuration information to an application. 
 It extends the BeanFactory interface, adding more advanced features to facilitate dependency injection and 
 application configuration.
 
 1. AnnotationConfigApplicationContext : used when the configuration is provided using Java-based annotations.
 2. ClassPathXmlApplicationContext : used to load context definitions from an XML file located in the classpath.
 3. FileSystemXmlApplicationContext : similar to ClassPathXmlApplicationContext, but it loads context definitions from an XML file located in the file system.
 4. WebApplicationContext : used for web applications. It is used in conjunction with a servlet context and is initialized by the Spring DispatcherServlet.
 
 XmlWebApplicationContext: An implementation that loads context definitions from an XML file.
 AnnotationConfigWebApplicationContext: An implementation that uses Java-based configuration.
 
 5. GenericApplicationContext : used with various configuration mechanisms, such as annotations, XML, or Groovy.
 
 
 
 
 
 
 */