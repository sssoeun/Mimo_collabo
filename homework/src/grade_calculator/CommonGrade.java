package grade_calculator;

public interface CommonGrade extends Grade{
	
	// 상
	int MIN_A = 90;
	int MIN_B = 80;
	int MIN_C = 70;
	int MIN_D = 55;

	
	// 추
	
	// 디
	
	// 정
	static String commonGrade(int score) {
		
		if (score >= MIN_A) {
			return "A";
		} else if (score >= MIN_B) {
			return "B";
		} else if (score >= MIN_C) {
			return "C";
		} else if (score >= MIN_D) {
			return "D";
		} else {
			return "F";
		}
		
	}
}
