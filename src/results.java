
public class results {
	
	public static void main(String[] args) {
	System.out.println("Exam Results Below");
	System.out.println("Physics Results - " + Physics(150));
	System.out.println("Chemistry Results - " + Chemistry(150));
	System.out.println("Biology Results - " + Biology(150));
	System.out.println("Total Exam Score - " + TotalExam(150,150,150));
	System.out.println("Exam Percentage - " + examPercentage(150, 150, 150));
	
		//int Physics;
		//int Chemistry;
		//int Biology;
		//int totalExam;
		//double examPercentage;
	}
	
	public static int Physics(int number1) {
		int ans = number1;
		return ans;
	}
	public static int Chemistry(int number1) {
		int ans = number1;
		return ans;
	}
	
	public static int Biology(int number1) {
		int ans = number1;
		return ans;
	}
	
	public static int TotalExam(int number1, int number2, int number3) {
		int ans = number1 + number2 + number3;
		return ans;
	}
	
	public static double examPercentage (double number1, double number2, double number3) {
		double ans = ((number1 + number2 + number3) / 450) * 100;
				return ans;
	}
}

