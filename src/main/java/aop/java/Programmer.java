package aop.java;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Employee{

	@Override
	public void work() {
		
//		Action.gotoOffice();
		// ���� ���� �ڵ�� ���X �ؾ��� �ڵ常 ���
		System.out.println("����Ʈ���� ������ �մϴ�");
		
		
//		System.out.println("�����");
//		Action.getoffOffice();
	}
	
}
