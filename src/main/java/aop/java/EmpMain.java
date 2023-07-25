package aop.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 Spring AOP Ư¡1
 1. ��Ÿ��(Runtime) ���
 2. ���Ͻ�(Proxy) ���
 3. �������̽�(Interface) ���
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
