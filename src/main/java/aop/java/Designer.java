package aop.java;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee{
	
	@Override
	public void work() {

//		Action.gotoOffice();
//		System.out.println("출근");
		System.out.println("디자인 시안 및 수정합니다");
//		Action.getoffOffice();
	}

}
