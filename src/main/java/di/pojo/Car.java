package di.pojo;

public class Car {
	
//	private HankookTire tire;
//	private KumhoTire tire;
	private Tire tire;
	
	public Car() {
		
	}
	
	
	



	public void setTire(Tire tire) {
		this.tire = tire;
	}



	public Car(Tire tire) {
		this.tire = tire;
		
//		tire = new HankookTire();
//		tire = new KumhoTire();
		
	}
	
	public void printTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getBrand());
	}
	
}
