import java.util.Scanner;
//import java.util.Math;

public class logarithmCalculator 
{
	final private static int ITERATIONS = 1000;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the number for which you would like to calculate the natural logarithm:");
		double x = Integer.parseInt(keyboard.nextLine());
		double y = (x-1)/x;
		System.out.printf("The natural logarithm of "+x+" is approximately %f",calculateLog(y));
	}

	private static double calculateLog(double x) {
		double result = 0;
		for (int i=0; i<=ITERATIONS; i++) {
			result += (Math.pow(x,i+1))/((double)(i+1));
			//System.out.println(Math.pow(1/x,i));
			//System.out.println(result);
		}

		
		return result;
		
	}
}