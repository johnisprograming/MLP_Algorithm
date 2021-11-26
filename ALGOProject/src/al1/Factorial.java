package al1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		System.out.print(n+"! = ");
		System.out.println("1 = " + factorial(n));
		
		sc.close();
	}
	
	static int factorial(int n) {
		 if(n == 0 || n == 1) {
			return 1;
		}else {
			System.out.print(n + " * ");
			return n *factorial(n-1);
		}
	}
}
