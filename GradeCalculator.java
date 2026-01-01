package week7;

public class GradeCalculator {
	public String checkPassFail(int grade) {
        if (grade >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
