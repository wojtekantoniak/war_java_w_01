package pl.coderslab.bean;

public class Component1 {

	Component2 component;
	
	public Component1(Component2 component){
		this.component = component;
	}


	public String getOi() {
		return component.getOi();
	}
}
