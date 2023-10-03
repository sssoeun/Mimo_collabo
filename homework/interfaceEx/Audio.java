package interfaceEx;

public class Audio implements RemoteControl{
	
	int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨은 : " + this.volume);
	}
	
	// 디폴트 메서드 재정의
	// 디폴트 메서드 재정의시 주의할 점 : 반드시 public 접근제한자를 붙여야 하고, default 키워드를 생략
	
	int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println(this.memoryVolume);
			System.out.println("오디오 무음 처리");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("오디오 무음 해제");
			setVolume(this.memoryVolume);
		}
	}
	
}
