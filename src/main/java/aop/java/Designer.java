package aop.java;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee{
	
	@Override
	public void work() {

//		Action.gotoOffice();
//		System.out.println("���");
		System.out.println("������ �þ� �� �����մϴ�");
//		Action.getoffOffice();
	}

}