package al1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("항의 개수 입력 : ");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            System.out.print(fibonacci(i) + " ");
        }
        
        sc.close();
    }

    public static int fibonacci(int n){
        if(n == 1 || n== 2) 
        	return 1;
        else 
        	return fibonacci(n-2) + fibonacci(n-1);
    }

}
