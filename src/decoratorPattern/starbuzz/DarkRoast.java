package decoratorPattern.starbuzz;

/**
 * 다크로스트
 * @author skypotato
 *
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "다크 로스트 커피";
	}
 
	public double cost() {
		return .99;
	}
}
