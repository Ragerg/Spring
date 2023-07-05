package pizza.pizzaStore;

import pizza.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
	
	public ChicagoPizzaStore(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
    public void createPizza() {
        System.out.println("시카고 피자가게에서 " + pizza.getName() + "만들기!");
    }

    @Override
    public void prepare() {
        System.out.println("시카고 피자가게에서 " + pizza.getName() + "준비 중~");
    }

    @Override
    public void bake() {
        System.out.println("시카고 피자가게에서 " + pizza.getName() + "굽는 중~");
    }

    @Override
    public void cut() {
        System.out.println("시카고 피자가게에서 " + pizza.getName() + "자르는 중~");
    }

    @Override
    public void box() {
        System.out.println("시카고 피자가게에서 " + pizza.getName() + "포장 중~");
    }

}
