
public interface IBaseRate {
	//method that derives the base rate
	default double baseRate() {
		return 2.5;
	}
}
