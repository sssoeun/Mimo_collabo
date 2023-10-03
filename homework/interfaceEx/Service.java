package interfaceEx;

public interface Service {
	
	// 상수
	
//	private abstract void hi();
	
	// 추상메서드
	
	
	// 디폴트 메서드
	default void defultMethod1() {
		System.out.println("여기는 defaultMethod1");
		defaultCommon();
	}
	
	default void defultMethod2() {
		System.out.println("여기는 defaultMethod2");
	}
	
	// private 메서드도 가능함 : 중복된 코드를 없애기 위해 주로 사용
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드 A");
		System.out.println("defaultMethod 중복 코드 B");
	}
	
	// 정적 메서드
	static void staticMethod1() {
		System.out.println("여기는 staticMethod1");
//		defaultCommon(); static 메서드 안에서 static이 아닌 메서드 호출 불가
		staticCommon(); // static 메서드 안에서 static 메서드만 호출
	}
	
	static void staticMethod2() {
		System.out.println("여기는 staticMethod2");
	}

	// private 정적 메서드
	private static void staticCommon() {
		System.out.println("staticCommon 중복 코드 C");
		System.out.println("staticCommon 중복 코드 D");
	}

}
