package work;

import java.awt.Toolkit;

public class MainApp {

	public static void main(String[] args) {
		Thread t = new Thread(new BeepTask());
		// ex 총을 만들고 장전함
		t.start(); // 장착된 클래스의 run() 실행
		
		Thread t2 = new Thread(new BeepTask2());
		// ex 총을 만들고 장전함
		t2.start(); // 장착된 클래스의 run() 실행
		
		// 쓰레드 하려면
		// 1. 일반 클래스 - Runnable 상속해야됨 implements
		// 2. 메인에 클래스 넣기
		// 3. 쓰레드는 종료될 때까지 게속 돌아야됨
		// 4. while(true)로 하면 계속 돌 듯?
		// 각자 기능이 개별적으로 있는 쓰레드가 잘 된 쓰레드임
		
		
	}

}
