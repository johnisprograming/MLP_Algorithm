package queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		// ť�� �� �߰� 
		System.out.println("ť�� �� 4�� ����");
		q.add("ȫ�浿");
		q.add("�̸���");
		q.add("������");
		
		q.offer("��ö��");
	
		System.out.println("\nť�� ���� ���");
		System.out.println(q);					// [ȫ�浿, �̸���, ������, ��ö��]
		System.out.println(q.toString());		// [ȫ�浿, �̸���, ������, ��ö��]
		
		System.out.println("\nť�� ũ�� : " + q.size());	// ť�� ũ�� : 4 (������ ��) 
		System.out.println("\npeek ����. ù ��° �� ��� : " + q.peek());	// ȫ�浿 
	
		System.out.println("\nù ��° �� ���� : " + q.poll()); //ȫ�浿 
		System.out.println(q);								// [�̸���, ������, ��ö��]
		
		// �Ǵ� remove() ��� 
		System.out.println("\nù ��° �� ���� : " + q.remove()); // �̸��� 
		System.out.println(q);								  // [������, ��ö��]
		
		// remove("�˻���")�� �˻��ؼ� ���� ���� 
		System.out.println("\n�˻��� �� ����(���� ���) : " + q.remove("���浿"));
		System.out.println("\n�˻��� �� ����(ã�� ���) : " + q.remove("��ö��"));
		System.out.println(q);  

	}

}
