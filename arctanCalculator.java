import java.util.Scanner;

public class arctanCalculator
{
	private static final int ITERATIONS = 1000;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the value for which you wish to calculate arctan (value must be positive):");
		int input = Integer.parseInt(keyboard.nextLine());
		System.out.println("The value of arctan("+input+") is "+calculateArctan(input));
	}

	private static double calculateArctan(double x) {
		double reciprocal = 1/x;
		double result = Math.PI/2;

		for (int i=0; i<ITERATIONS; i++) {
			result -= Math.pow(-1,i)*Math.pow(reciprocal,2*i+1)/(2*i+1);
		}
		return result;
	}
}