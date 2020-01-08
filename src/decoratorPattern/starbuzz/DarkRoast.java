package decoratorPattern.starbuzz;

/**
 * 다크로스트
 * @author skypotato
 *
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}
