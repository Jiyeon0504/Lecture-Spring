package aop.pojo;

public class Programmer implements Employee{

	@Override
	public void work() {
		
		Action.gotoOffice();
		System.out.println("����Ʈ���� ������ �մϴ�");
//		System.out.println("�����");

		Action.getoffOffice();
	}
	
}
