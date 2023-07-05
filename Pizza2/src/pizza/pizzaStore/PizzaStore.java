package pizza.pizzaStore;

import pizza.pizza.Pizza;

public class PizzaStore {

	protected Pizza pizza;

	public void createPizza() {
//		System.out.println(pizza.getName() + "만들기!");
	}
	
	public void prepare() {
//		System.out.println(pizza.getName() + "준비 중~");
	}
	
	public void bake() {
//		System.out.println(pizza.getName() + "굽는 중~");
	}
	
	public void cut() {
//		System.out.println(pizza.getName() + "자르는 중~");
	}
	
	public void box() {
//		System.out.println(pizza.getName() + "포장 중~");
	}

	public Pizza orderPizza() {
		
		createPizza();
		prepare();
		bake();
		cut();
		box();
		
		return pizza;
	}

}
