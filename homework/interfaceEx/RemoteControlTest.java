package interfaceEx;

public class RemoteControlTest {

   public static void main(String[] args) {
//      new RemoteControl();
      
      RemoteControl remotecontrol;
//      remotecontrol = new RemoteControl();
      
      // 인터페이스(참조형 : 배열, 열거, 클래스, 인터페이스) 도 타입으로 선언이 가능
      // 인터페이스 자체로는 인스턴스화(객체) 할 수 없으므로, 그 인터페이스를 구현한 클래스로 객체를 만들어서
      // 인터페이스 타입의 인터페이스형 참조변수를 초기화하는 것이 가장 일반적인 초기화 기법이다.
      
      remotecontrol = new Television();
      System.out.println(remotecontrol);
      remotecontrol.turnOn();
      
      
      remotecontrol = new Audio();
      System.out.println(remotecontrol);
      remotecontrol.turnOn();
      
   }

} 




