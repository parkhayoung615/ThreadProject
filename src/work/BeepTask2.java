package work;

import java.awt.Toolkit;

public class BeepTask2 implements Runnable {

	@Override
	public void run() {
		// ������ �ϸ鼭 �ʰ� �ö� - �̷� ������ ���
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			// �̰� for ������ ���� �Ǹ� ���������� ���尡 �� �� ������
			// �����δ� �׷��� �ʴ�
			// �ΰ��� ������ �� �ְ� ��� ����ϸ� ������ (try catch ������)
			toolkit.beep(); // ���尡 ��
			System.out.println("��!");
			try {
				Thread.sleep(500); // �̰� 0.5��
				// �̰ɷ� �����ʸ� 1�� ������ �ٲٸ鼭 �ΰ��� ������ �� �ְ� ��
			} catch (Exception e) {
			}
		}
	}

}
