package work;

import java.awt.Toolkit;

public class MainApp {

	public static void main(String[] args) {
		Thread t = new Thread(new BeepTask());
		// ex ���� ����� ������
		t.start(); // ������ Ŭ������ run() ����
		
		Thread t2 = new Thread(new BeepTask2());
		// ex ���� ����� ������
		t2.start(); // ������ Ŭ������ run() ����
		
		// ������ �Ϸ���
		// 1. �Ϲ� Ŭ���� - Runnable ����ؾߵ� implements
		// 2. ���ο� Ŭ���� �ֱ�
		// 3. ������� ����� ������ �Լ� ���ƾߵ�
		// 4. while(true)�� �ϸ� ��� �� ��?
		// ���� ����� ���������� �ִ� �����尡 �� �� ��������
		
		
	}

}
