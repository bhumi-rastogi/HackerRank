import java.util.Scanner;

public class JavaStdinandStdout2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        double d = scn.nextDouble();
        scn.nextLine(); 
        String x = scn.nextLine();

        // Write your code here.

        System.out.println("String: " + x);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scn.close();

	}

}
