import java.util.Scanner;

public class DivisibleByTwoAndThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        if(x%2==0 & x%3==0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }
	}

}
