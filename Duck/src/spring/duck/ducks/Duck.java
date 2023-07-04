package spring.duck.ducks;

import spring.duck.flyBehavior.FlyBehavior;
import spring.duck.quackBehavior.QuackBehavior;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	

	public Duck() {
		super();
	}

	public abstract void display();
	
	public void performQuack() {
		 quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}


}
