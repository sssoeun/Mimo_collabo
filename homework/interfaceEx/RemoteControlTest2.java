package interfaceEx;

public class RemoteControlTest2 {

	public static void main(String[] args) {
		
//		Television tv = new Television();
//		
//		tv.turnOn();
//		tv.setVolume(5);
//		tv.setVolume(20);
//		tv.setMute(true);
//		
//		System.out.println("--------------------");
		
		Audio audio = new Audio();
		audio.turnOn();
//		audio.setVolume(5);
//		audio.setVolume(20);
//		audio.setVolume(-9);
		
//		audio.setMute(false);
//		System.out.println("--------------------");
//		audio.setMute(true);
//		audio.setMute(false);
//		audio.setVolume(9);
		
		audio.setVolume(5);
		audio.setMute(true);
		System.out.println("--------------------");
		audio.setMute(false);
		
	}
	
}
