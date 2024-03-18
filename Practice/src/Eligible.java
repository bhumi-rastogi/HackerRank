import java.util.Scanner;

public class Eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scn = new Scanner(System.in);
	        int x = scn.nextInt();
	        if(x<18){
	            System.out.println("not eligible");
	        }else{
	            System.out.println("eligible");
	        }
	    }
	}

