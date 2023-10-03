package interfaceEx;

public interface RemoteControl {

	// 상수
	public static final int MAX_VOLUME = 10;  // public static final 생략 가능하나 익숙할때까지는 일단 쓰세요...
	public static final int MIN_VOLUME = 0;
	
	
	// 추상메서드
	public abstract void turnOn();  // public abstract
	void setVolume(int volume);
	
	// 디폴드메서드(리모콘이 기본적으로 가지고 있어야 할 메서드), 음소거 기능 -> 실행 클래스에서 재정의할 때는 접근제한자를 public 으로 해야 함
	default void setMute(boolean mute) {
		System.out.println("hi");
		if(mute) {
			System.out.println("무음처리");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제");
		}
	}
	
	
	// 정적메서드
	static void changeBattery() {
		
	}
	
	
}
