package twoDArray;

public class AvgPayForEveryStep {

	public static void main(String[] args) {
		double[][] payScaleTable = { { 10.50, 12.00, 14.50, 16.75, 18.00 }, { 20.50, 22.25, 24.00, 26.25, 28.00 },
				{ 34.00, 36.50, 38.00, 40.35, 43.00 }, { 50.00, 60.00, 70.00, 80.00, 99.99 } };

		double[] avg = new double[payScaleTable.length];
		for (int rowIndex = 0; rowIndex < payScaleTable.length; rowIndex++) {// arr.length return how many rows in that
																				// array
			double sum = 0;
			for (int colIndex = 0; colIndex < payScaleTable.length; colIndex++) {
				sum += payScaleTable[rowIndex][colIndex];

			}
			avg[rowIndex] = sum / payScaleTable.length;
			System.out.print(avg[rowIndex] + "  ");
		}
	}

}
