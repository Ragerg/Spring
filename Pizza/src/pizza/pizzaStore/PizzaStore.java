package pizza.pizzaStore;

import pizza.pizza.Pizza;

public abstract class PizzaStore {
	
	protected Pizza pizza; 
	
	protected abstract Pizza createPizza();
	
	public Pizza orderPizza() {
		
		Pizza pizza = null;
		
		pizza = createPizza();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
