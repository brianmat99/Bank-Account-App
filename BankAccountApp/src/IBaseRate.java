
public interface IBaseRate {
	//method that derives the base rate
	default double getBaseRate() {
		return 2.5;
	}
}
