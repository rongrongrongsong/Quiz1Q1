package package1;
import java.util.Scanner;
public class QBRating {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of passing attempts(ATT):");
		double ATT = input.nextDouble();
		System.out.println("Enter the Number of completions(COMP):");
		double COMP = input.nextDouble();
		System.out.println("Enter the Passing yards (YDS):");
		double YDS = input.nextDouble();
		System.out.println("Enter the Touchdown passes (TD):");
		double TD = input.nextDouble();
		System.out.println("Enter the Interceptions(INT):");
		double INT = input.nextDouble();
		input.close();

		double a=(COMP/ATT-.3)*5;
		if (a > 2.375){
			a = 2.375;
		}
		else if (a<0) {
			a=0;
		}
		double b=(YDS/ATT-3)*0.25;
		if (b > 2.375){
			b = 2.375;
		}
		else if (b<0) {
			b=0;
		}
		double c=(TD/ATT)*20;
		if (c > 2.375){
			c = 2.375;
		}
		else if (c<0) {
			c=0;
		}

		double d=2.375-(INT/ATT*25);
		if (d > 2.375){
			d = 2.375;
		}
		else if (d<0) {
			d=0;
		}
		double QBRating=(a+b+c+d)*100/6;
		System.out.printf("The QB rating is %4.1f ", QBRating);
		
	}
}

