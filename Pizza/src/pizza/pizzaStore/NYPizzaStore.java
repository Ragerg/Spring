package pizza.pizzaStore;

import pizza.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	public NYPizzaStore() {
		
	}
	
	public NYPizzaStore(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	protected Pizza createPizza() {

		return pizza;
	}

	
}
