package RecoveryExam.object;

public class TestHeight {

	public static void main(String[] args) {
		Height x = new Height(15, 2);
		x.setRecommendedWeight();
		System.out.println(x.getRecommendedWeight());
	}
}
