package di.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class DIMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-anno2.xml");
//		context.getBean("car", Car.class);
		
		Car car = context.getBean("car", Car.class);
//		Tire tire = context.getBean("hankook", Tire.class);
//		car.setTire(tire);
		car.printTireBrand();
		
		/*
	 Tire tire=  new HankookTire();
	 Car c = new Car();
	 c.setTire(tire)
	  */
		
	}
}
