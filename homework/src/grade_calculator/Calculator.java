package grade_calculator;

public class Calculator implements CreditGrade, CommonGrade{

	// 필
	MajorComputer majorC = new MajorComputer();
	MajorKorean majorK = new MajorKorean();
	
	String result;
	String course;
	
	// 생
	
	// 메
	@Override
	public void calMath(String name, int num, String major, int score) {
	
		if(major == majorC.majorName) {
			result = CreditGrade.creditGrade(score);
			course = majorC.majorCourse;
			System.out.printf("%s | %d | %s | %d:%s |\n", name, num, course, score, result );
		} else { 
			result = CommonGrade.commonGrade(score);
			course = majorK.majorCourse;
			System.out.printf("%s | %d | %s | %d:%s |\n", name, num, course, score, result );
		}
		
		System.out.println("-------------------------------");
	}
	
	@Override
	public void calKorean(String name, int num, String major, int score) {
		
		if(major == majorK.majorName) {
			result = CreditGrade.creditGrade(score);
			course = majorK.majorCourse;
			System.out.printf("%s | %d | %s | %d:%s |\n", name, num, course, score, result );
		} else { 
			result = CommonGrade.commonGrade(score);
			course = majorC.majorCourse;
			System.out.printf("%s | %d | %s | %d:%s |\n", name, num, course, score, result );
		}

		System.out.println("-------------------------------");
	}
	
	public void resultReport(String course) {
		System.out.println("-------------------------------");
		if (course == "국어") {
			System.out.println("       국어 수강생 학점          ");
		} else {
			System.out.println("       수학 수강생 학점          ");
		}
		System.out.println(" 이름  |  학번  |중점과목|  점수  ");
		System.out.println("-------------------------------");
	}
	
	
}
