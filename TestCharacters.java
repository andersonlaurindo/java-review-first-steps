
public class TestCharacters {
	
	public static void main(String args[]) {
		char letter = 'a';
		System.out.println(letter); //Output: a
		char letterValue = 65;
		System.out.println(letterValue); //Output: A
		char nextLetterValue = (char) (letterValue + 1);
		System.out.println(nextLetterValue); //Output: B
		String sentence = "String test";
		System.out.println(sentence); //Output: String test
		String newSentence = "String test" + 1;
		System.out.println(newSentence); //Output: String test1
	}
}
