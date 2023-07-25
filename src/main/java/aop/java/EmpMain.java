package aop.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 Spring AOP 특징1
 1. 런타임(Runtime) 기반
 2. 프록시(Proxy) 기반
 3. 인터페이스(Interface) 기반
 */


public class EmpMain {

	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			
	
	Employee programmer = context.getBean("programmer", Employee.class);
	
	programmer.work();
			
	Employee designer = context.getBean("designer", Employee.class);
	designer.work();
	
	
	}
}
