package al1;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ݾ� ���� �迭�� ���� : ũ �ݾ� �տ� ��ġ
		int[] unit = {5000, 1000, 500, 100, 50, 10};
				
        System.out.print("�ݾ� �Է� : ");
        int money = sc.nextInt();
        
        //18973
        for(int i=0; i<unit.length; i++) {
        	System.out.println(unit[i] + "�� : " + money / unit[i]); // �������� ��
        	money %= unit[i]; 
        }
        
        System.out.print("������ : " + money);
	}
}
