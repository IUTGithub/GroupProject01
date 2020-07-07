// CS112 Exam#01
// Name: Kenny Fok
public class Exam01_02a {

	public static void main(String[] args) {
		final int	TOTALROLLS = 1;
		
		Dice08		d8_01 = new Dice08();
		Dice08		d8_02 = new Dice08();
		Dice12  	d12 = new Dice12();
		SuperDice 	sd8_01 = new SuperDice(5);
		SuperDice 	sd8_02 = new SuperDice(4);
		SuperDice 	sd8_03 = new SuperDice(5);
			
		
		for (int i = 1 ; i <= TOTALROLLS ; i++) {
			System.out.printf("ROLL #%d:\n", i);
			System.out.printf("d8_01: %d\n", d8_01.roll());
			System.out.printf("d8_02: %d\n", d8_02.roll());
			System.out.printf("d12: %d\n", d12.roll());
			System.out.printf("sd8_01: %d\n", sd8_01.roll());
			System.out.printf("sd8_02: %d\n", sd8_02.roll());
			System.out.printf("sd8_03: %d\n", sd8_03.roll());
			System.out.printf("================\n");

		}
		
		System.out.printf("Are d8_01 and d8_02 equal? %s\n", (d8_01.equals(d8_02))? "Yes" : "No");
		System.out.printf("Are d8_02 and d12 equal? %s\n", (d8_02.equals(d12))? "Yes" : "No");
		System.out.printf("Are sd8_01 and sd8_02 equal? %s\n", (sd8_01.equals(sd8_02))? "Yes" : "No");
		System.out.printf("Are sd8_01 and sd8_03 equal? %s\n", (sd8_01.equals(sd8_03))? "Yes" : "No");
		System.out.printf("Are sd8_01 and d8_02 equal? %s\n", (sd8_01.equals(d8_02))? "Yes" : "No");
		System.out.printf("Are sd8_02 and d12 equal? %s\n", (sd8_02.equals(d12))? "Yes" : "No");
	}
}
