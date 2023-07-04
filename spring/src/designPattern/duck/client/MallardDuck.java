package designPattern.duck.client;

import designPattern.duck.flyBehavior.FlyWithWings;
import designPattern.duck.quackBehavior.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.print("나는 mallard : ");
	}

}
