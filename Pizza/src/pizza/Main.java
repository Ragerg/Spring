package pizza;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pizza.pizza.Pizza;
import pizza.pizzaStore.PizzaStore;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("pizza/setting.xml");
		PizzaStore pizzaStore = context.getBean("pizzaStore", PizzaStore.class);
		Pizza pizza = pizzaStore.orderPizza();
		
	}

}
