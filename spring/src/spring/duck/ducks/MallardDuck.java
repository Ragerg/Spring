package spring.duck.ducks;

import spring.duck.flyBehavior.FlyWithWings;
import spring.duck.quackBehavior.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.print("나는 mallard : ");
	}

}
