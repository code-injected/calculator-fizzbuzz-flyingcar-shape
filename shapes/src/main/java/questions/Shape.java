package questions;

import java.util.ArrayList;

import questions.properties.PropertiesInterface;

public abstract class Shape {
	
	protected String shapeName;
	protected ArrayList<PropertiesInterface> propertiesArray = new ArrayList<PropertiesInterface>();
	
    abstract void draw();
    
	public void registerProperty(PropertiesInterface p) {
		System.out.printf("New property added: %s\n", p.getPropertyName());
		propertiesArray.add(p);
	}
	
	public void clearProperties(){
		propertiesArray.clear();
	}
	
	public int getNumberProperties(){
		return propertiesArray.size();
	}
}
