
package com.design.test;

import com.design.decorator.BasicCar;
import com.design.decorator.Car;
import com.design.decorator.LuxuryCar;
import com.design.decorator.SportsCar;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n#####");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
