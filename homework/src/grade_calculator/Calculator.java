package grade_calculator;

public class Calculator implements CreditGrade, CommonGrade{

	MajorComputer majorC = new MajorComputer();
	MajorComputer majorK = new MajorComputer();
	
	
	@Override
	public void calMath(String name, int num, String course, int score) {
	
		if(course == majorC.majorCourse) {
			
		} else { 
			
		}
	}
	
	@Override
	public void calKorean(String name, int num, String course, int score) {
		
		if(course == majorK.majorCourse) {
			
		} else { 
			
		}
		
	}
	
}
