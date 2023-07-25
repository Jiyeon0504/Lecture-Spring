package aop.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 Spring AOP Ư¡1
 1. ��Ÿ��(Runtime) ���
 2. ���Ͻ�(Proxy) ���
 3. �������̽�(Interface) ���
 */


public class EmpMain {

	public static void main(String[] args) {
		
	ApplicationContext context = new GenericXmlApplicationContext("aop-anno.xml");	
//	Programmer programmer = context.getBean("programmer", Programmer.class);
	//�������̽� ������� �ٲ���� �ؼ� ���÷��������� �ٲ������ 
	Employee programmer = context.getBean("programmer", Employee.class);
	
	programmer.work();
			
	Employee designer = context.getBean("designer", Employee.class);
	designer.work();
	
	
	}
}
