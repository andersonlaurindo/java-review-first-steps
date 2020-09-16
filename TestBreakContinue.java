
public class TestBreakContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}
		// Output: 0 1
		
		for (int i = 0; i < 4; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
		// Output: 0 1 3
	}
}
