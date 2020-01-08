package decoratorPattern.starbuzz;

/**
 * 음료
 * @author skypotato
 *
 */
public abstract class Beverage {
	String description = "음료";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
