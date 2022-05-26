// 4. 키(실수, 미터단위)와 몸무게(실수, kg단위)를 전달받아
// 한국기준 BMI 지수(실수) 구해 반환하는 메소드.
// BMI = (몸무게) / (키)^2

public class BMI {
	
	public static double bmiGo(double h, double w) {
		double bmi = w / (h * h);
		return bmi;
	}
	
	public static void main(String[] args) {
		
	}
}