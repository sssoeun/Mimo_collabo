package grade_calculator;

public interface CreditGrade extends Grade{
	
	// 상
	int MIN_S = 95;
	int MIN_A = 90;
	int MIN_B = 80;
	int MIN_C = 70;
	int MIN_D = 60;

	// 추
	
	// 디

	// 정
	static String creditGrade(int score) {
		
		if(score >= MIN_S) {
			return "S";
		} else if (score >= MIN_A) {
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
