package aop.pojo;

public class EmpMain {

	public static void main(String[] args) {
		
		
		Employee emp01=new Programmer();
		emp01.work();
		
		
		Designer emp02=new Designer();
		emp02.work();
	}
}
