
public class TestConditional {

	public static void main(String[] args) {

		int age = 22;
		int numberPeople = 1;
		boolean accompanied = (numberPeople > 1);
		if ((age >= 21 || accompanied) && numberPeople < 20) {
			System.out.println("You are allowed!");
			switch (numberPeople) {
				case 1:
					System.out.println("Table for 1 on the right!");
					break;
				case 2:
					System.out.println("Table for 2 on the left!");
					break;
				default:
					System.out.println("Table for group on the patio!");
			}
		} else {
			System.out.println("You arent't allowed!");
		}
		// Output: You are allowed!
		// Output: Table for 1 on the right!
	}
}
