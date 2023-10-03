package interfaceEx;

public class ServiceImplTest {
	
	public static void main(String[] args) {
		ServiceImpl serviceImpl = new ServiceImpl();
		
		// 디폴트 메서드 호출
		serviceImpl.defultMethod1();
		serviceImpl.defultMethod2();
		
		
		System.out.println("-------------------");
		
		Service.staticMethod1();
		Service.staticMethod2();
		
	}

}
