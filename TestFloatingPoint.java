
public class TestFloatingPoint {

	public static void main(String args[]) {
        
		double salary = 1250.71;
        System.out.println("S: " + salary); //Output: S: 1250.7
        double division = 3.14 / 2;
        System.out.println(division); //Output: 1.57
        int otherDivision = 5 / 2;
        System.out.println(otherDivision); //Output: 2
        double newDivision = 5 / 2;
        System.out.println(newDivision); //Output: 2.0
        double lastDivision = 5.0 / 2;
        System.out.println(lastDivision); //Output: 2.5
        double number1 = 0.2;
        double number2 = 0.1;
        System.out.println(number1 + number2);
        //Output: 0.30000000000000004
	}
}
