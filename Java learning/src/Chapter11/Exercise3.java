package Chapter11;

public class Exercise3 {
	// 1. Creates two variables. One char and one int.
	private char letter;
	private int value;
	
	// Instantiates the two variables.
	public Exercise3(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	
	// Prints the variables in a readable format.
	public void printTile() {
		System.out.println("Letter: " + letter + "\tValue: " + value);
	}
	
	// Creates a test tile to print with the printTile().
	public void testTile() {
		Exercise3 test = new Exercise3('Z', 10);
		test.printTile();
	}
	
	// Creates a toString method to return the variables in a readable format.
	public String toString() {
		return "Letter: " + letter + "\tValue: " + value;
	}
	
	// Creates an equals method to see if two tiles are equivalent.
	public boolean equals(Exercise3 that) {
		return this.letter == that.letter && this.value == that.value;
	}
	
	// Getter method for the letter variable.
	public char getLetter() {
		return this.letter;
	}
	
	// Setter method for the letter variable.
	public char setLetter(char otherLetter) {
		return this.letter = otherLetter;
	}
	
	// Getter method for the value variable.
	public int getValue() {
		return this.value;
	}
	
	// Setter method for the value variable.
	public int setValue(int otherValue) {
		return this.value = otherValue;
	}
	
}
