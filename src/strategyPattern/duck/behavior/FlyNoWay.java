package strategyPattern.duck.behavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날개는 장식일 뿐이죠.");
	}
}
