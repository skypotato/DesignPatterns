package decoratorPattern.starbuzz;

/**
 * 우유
 * @author skypotato
 *
 */
public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 우유";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
