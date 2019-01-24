//https://wiki.sei.cmu.edu/confluence/display/java/ERR04-J.+Do+not+complete+abruptly+from+a+finally+block

public class ThirdMistake {

	public static void main(String[] args) {
		System.out.println(div(12, 0));
	}
	
	public static double div(double numerator, double denominator) {
		double ans;
		
		try {
			ans = numerator / denominator;
		} catch (Exception e) {
			System.out.println("No zero in denominator.");
		} finally {
			return 0;
		}
		
		return ans;
	}

}
