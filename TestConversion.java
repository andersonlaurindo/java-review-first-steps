
public class TestConversion {

	public static void main(String[] args) {
		
		//Implicit casting
		int testInteger = 20;
		double testDouble = testInteger;
		System.out.println(testDouble); //Output: 20.0
		System.out.println(testInteger); //Output: 20

		//Explicit casting
		double newtestDouble = 10.5;
		int newtestInteger = (int) newtestDouble;
		System.out.println(newtestDouble); //Output: 10.5
		System.out.println(newtestInteger); //Output: 10

	}
}
