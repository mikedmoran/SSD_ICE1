//https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods

public class SecondMistake {
	public static void main(String[] args) {

		String strTest = "This will be a string with no spaces.";
		strTest = strTest.replaceAll(" ", "");
		System.out.println(strTest);
		
	}
}
