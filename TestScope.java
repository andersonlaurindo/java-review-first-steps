
public class TestScope {
	public static void main(String[] args) {

		{ // This is a block
			int x = 100;

			// Code here CAN use x
			System.out.println(x);

		} // The block ends here

		// Code here CANNOT use x
	}
}
