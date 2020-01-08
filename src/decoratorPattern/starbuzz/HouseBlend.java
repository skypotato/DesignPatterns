package decoratorPattern.starbuzz;

/**
 * 하우스 블랜딩 커피
 * @author skypotato
 *
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "하우스 블랜딩 커피";
	}
 
	public double cost() {
		return .89;
	}
}

