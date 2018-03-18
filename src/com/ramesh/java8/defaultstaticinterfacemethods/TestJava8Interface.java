package com.ramesh.java8.defaultstaticinterfacemethods;

import com.ramesh.java8.defaultstaticinterfacemethods.impl.Car;
import com.ramesh.java8.defaultstaticinterfacemethods.impl.Motorbike;
import com.ramesh.java8.defaultstaticinterfacemethods.impl.MultiAlarmCar;
import com.ramesh.java8.defaultstaticinterfacemethods.interfaces.Vehicle;

public class TestJava8Interface {
	public static void main(String[] args) {

		Vehicle car = new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 480));
		
		Vehicle bike = new Motorbike("ACTIVA 4G");
		System.out.println(bike.getBrand());
		System.out.println(bike.speedUp());
		System.out.println(bike.slowDown());
		System.out.println(bike.turnAlarmOn());
		System.out.println(bike.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 480));
		
	}
}
