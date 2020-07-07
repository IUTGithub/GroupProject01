
public class SuperDice extends Dice08 {
	private int numAutoRoll;
	public SuperDice(int Rolls) {
		super();
		numAutoRoll = Rolls;
	}
	
	@Override
	public int roll() {
		double sum = 0;
		double average = 0;
		for (int x = 0; x < numAutoRoll; x++) {
			sum += super.roll();
		}
		average = sum/numAutoRoll;
		return (int) average;
	}
}
