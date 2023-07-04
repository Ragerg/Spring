package spring.duck.ducks;

import spring.duck.flyBehavior.FlyWithWings;
import spring.duck.quackBehavior.Quack;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.print("나는 redhead : ");
	}
}
