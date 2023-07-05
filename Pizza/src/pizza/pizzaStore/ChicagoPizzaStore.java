package pizza.pizzaStore;

import pizza.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
	
	public ChicagoPizzaStore() {
		
	}
	
	public ChicagoPizzaStore(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	protected Pizza createPizza() {
		
		System.out.println(this.pizza.getName() + "만들기!!");
		return pizza;
	}

}
