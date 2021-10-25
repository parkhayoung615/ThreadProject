package work;

import java.awt.Toolkit;

public class BeepTask2 implements Runnable {

	@Override
	public void run() {
		// 게임을 하면서 초가 올라감 - 이런 식으로 사용
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			// 이걸 for 문으로 쓰게 되면 연속적으로 사운드가 날 것 같지만
			// 실제로는 그렇지 않다
			// 인간이 감지될 수 있게 끊어서 재생하면 가능함 (try catch 문으로)
			toolkit.beep(); // 사운드가 남
			System.out.println("댕동!");
			try {
				Thread.sleep(500); // 이건 0.5초
				// 이걸로 나노초를 1초 단위로 바꾸면서 인간이 감지할 수 있게 함
			} catch (Exception e) {
			}
		}
	}

}
