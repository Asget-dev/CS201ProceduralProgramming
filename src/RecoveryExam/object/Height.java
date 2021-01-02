package RecoveryExam.object;

public class Height {
	private int height;
	private int age;
	private int recommendedWeight;

	public Height(int x, int y) {
		height = x;
		age = y;
	}

	public int getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public double getRecommendedWeight() {
		return recommendedWeight;
	}

	public void setRecommendedWeight() {
		recommendedWeight = (int) ((getHeight() - 100 + getAge() / 10) * 0.9);
	}
}
