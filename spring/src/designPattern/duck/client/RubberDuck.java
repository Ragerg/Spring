package designPattern.duck.client;

import designPattern.duck.flyBehavior.FlyNoWay;
import designPattern.duck.quackBehavior.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.print("나는 rubber duck : ");
	}
}
