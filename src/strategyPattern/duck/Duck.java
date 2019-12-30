package strategyPattern.duck;

import strategyPattern.duck.behavior.FlyBehavior;
import strategyPattern.duck.behavior.QuackBehavior;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("오리궁둥이 씰룩씰룩 수영잘하지요.");
	}
}
