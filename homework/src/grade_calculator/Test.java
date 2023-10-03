package grade_calculator;

public class Test {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		

		calculator.resultReport("국어");
		calculator.calKorean("안성원", 181213, "국어국문학과", 95);
		calculator.calKorean("오태운", 182330, "컴퓨터공학과", 95);
		calculator.calKorean("이동호", 171518, "국어국문학과", 100);
		calculator.calKorean("조성욱", 172350, "국어국문학과", 89);
		calculator.calKorean("최태평", 171290, "컴퓨터공학과", 85);
		
		calculator.resultReport("수학");
		calculator.calMath("안성원", 181213, "국어국문학과", 56);
		calculator.calMath("오태운", 182330, "컴퓨터공학과", 95);
		calculator.calMath("이동호", 171518, "국어국문학과", 88);
		calculator.calMath("조성욱", 172350, "국어국문학과", 95);
		calculator.calMath("최태평", 171290, "컴퓨터공학과", 56);
	}
}
