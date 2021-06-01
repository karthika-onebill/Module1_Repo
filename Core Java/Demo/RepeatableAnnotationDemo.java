package com.onebill.java_basics;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

import com.sun.tools.javac.code.Attribute.RetentionPolicy;

public class RepeatableAnnotationDemo {

	@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
	public @interface Cars{
		Manufacturer[] value() default { };      // multiple annotations  - A car have multiple annotation manufacturer
	}
	@Manufacturer("toyato")
	@Manufacturer("Nano")
	@Manufacturer("BMW")
	@Manufacturer("TATA")
	@Manufacturer("Ambastor")
	
	public @interface Car{
		String value();
	}
	@Repeatable(value=  Cars.class)
	public @interface Manufacturer{
		String value();
	}
	
	public static void main(String[] args) {
		
		Manufacturer[] a = Car.class.getAnnotationsByType(Manufacturer.class);
		Cars cars = Car.class.getAnnotation(Cars.class);
		for(Manufacturer m :cars.value()) {
			System.out.println(m.value());
		}
	}

}
