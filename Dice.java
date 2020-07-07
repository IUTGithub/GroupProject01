abstract class Dice {
	private int numSides;
	public Dice(int numberOfSides) {
		numSides = numberOfSides;
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Dice) { // Check if they're of Dice class
			// Check the individual classes so we prevent SuperDice
			// being equal to Dice08
			if (obj.getClass() == this.getClass()) {
				Dice newDice = (Dice) obj;
				return newDice.getNumSides() == this.getNumSides();
			}
		}
		return false;
	}
	
	public int roll() {
		return (int) (Math.random() * numSides);
	}
	
}
