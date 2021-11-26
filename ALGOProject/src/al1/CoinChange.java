package al1;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 금액 단위 배열로 생성 : 크 금액 앞에 위치
		int[] unit = {5000, 1000, 500, 100, 50, 10};
				
        System.out.print("금액 입력 : ");
        int money = sc.nextInt();
        
        //18973
        for(int i=0; i<unit.length; i++) {
        	System.out.println(unit[i] + "원 : " + money / unit[i]); // 나누기한 몫
        	money %= unit[i]; 
        }
        
        System.out.print("나머지 : " + money);
	}
}
