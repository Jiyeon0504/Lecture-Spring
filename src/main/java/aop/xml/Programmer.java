package aop.xml;

public class Programmer implements Employee{

	@Override
	public void work() {
		
//		Action.gotoOffice();
		// 공통 실행 코드는 명시X 해야할 코드만 명시
		System.out.println("소프트웨어 개발을 합니다");
		
		
//		System.out.println("퇴근함");
//		Action.getoffOffice();
	}
	
}
