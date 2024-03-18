import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		if (x>=35) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
