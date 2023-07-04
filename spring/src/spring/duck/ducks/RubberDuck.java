package spring.duck.ducks;

import spring.duck.flyBehavior.FlyNoWay;
import spring.duck.quackBehavior.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.print("나는 rubber duck : ");
	}
}
