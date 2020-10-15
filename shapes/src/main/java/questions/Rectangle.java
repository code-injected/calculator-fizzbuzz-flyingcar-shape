package questions;

import java.util.Iterator;

import questions.properties.CustomProperty;
import questions.properties.PropertiesInterface;

public class Rectangle extends Shape {

	public Rectangle(){
		shapeName = "Rectangle";
	}
	
	@Override
	void draw() {
		Iterator<PropertiesInterface> it = propertiesArray.iterator();
		
		if(it.hasNext()){
			System.out.printf("I'm painting a %s with the following properties:\n", shapeName);
		}
		
		while(it.hasNext()){
			PropertiesInterface p = it.next();
			System.out.printf("   *%s\n", p.getPropertyName());
		}
	}
	
	public static void main(String... args){
		Rectangle r = new Rectangle();
		r.registerProperty(new CustomProperty("Red border"));
		r.registerProperty(new CustomProperty("Thick pen"));
		r.draw();
	}

}
