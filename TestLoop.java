
public class TestLoop {

	public static void main(String[] args) {
		int counter = 0;
		while(counter <= 1) {
			System.out.println(counter);
			counter++;
		}
		System.out.println(counter);

		for(int newCounter = 0; newCounter <= 1; newCounter++) {
			System.out.println(newCounter);
		}
		//Output: 0 1 2 0 1
	}
}
